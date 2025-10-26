import React from 'react'

const EventExample1 = () => {
    function handleClick(){
        alert("button Clicked");
    }
    function handleClicke2(name){
        alert("button  Clicked " + name);

    }

  return (
     <>
     <button onClick={handleClick}>Click Me</button> <br /><br />
     <button onDoubleClick={()=>{
        alert("Double Click");
     }}>Double Click </button> <br /> <br />
     <button onDoubleClick={()=>{handleClicke2("omnath")}}>Handle Click</button>
     </>
  )
}

export default EventExample1