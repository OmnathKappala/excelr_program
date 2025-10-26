 import React from 'react'

const EventExample3 = () => {
    let[items,setItems]=React.useState([]);
  let container = {
    display: 'flex',
    justifyContent: 'center',
  }

  let item = {
    height: '50px',
    width: '50px',
    backgroundColor: 'red',
    margin: '10px',
    padding: '10px',
    color: 'white',
  }

  let droppable={
    border:'4px dotted black',
  }


  function handleDragover(e){
    e.preventDefault();
  }

  function handleDrop(e){
    e.preventDefault();
    let data=e.dataTransfer.getData('text/plain');
//     setItems([...items,data]);
          setItems(data);


  }

  function handleDragStart(e){
    e.dataTransfer.setData('text/plain',e.target.innerText);
  }

  return (
     <>
     <h1>Drag and Drop Example</h1>
    <div style={container}>
      <div style={item} draggable onDragStart={handleDragStart}>Item1</div>
      <div style={item} draggable onDragStart={handleDragStart}>Item2</div>
      <div style={item} draggable onDragStart={handleDragStart}>Item3</div>
    </div>
    <div style={droppable}
    onDragOver={handleDragover} 
    onDrop={handleDrop}
    >Drop Here</div>
    {
        items && <div>{items}</div>
        // items.map(
        //     (item,index)=>{
        //         return <div key={index}>{item}</div>           
        //      }
        // )
    }

     </>
  )
}

export default EventExample3