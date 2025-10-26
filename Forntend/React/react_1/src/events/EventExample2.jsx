import React, { useState } from 'react'

const EventExample2 = () => {
    let [color,setColor]=useState(false);
    let style={
        border:'1px solid black',
        width:'200px',
        height:'200px',
        margin:'20px',
        backgroundColor:color?'green':'pink'
    }
    function handleMouseEnter(){
        setColor(true);

    }
    function handleMouseLeave(){
        setColor(false);

    }

  return (
     <>
     <div style={style} onMouseEnter={handleMouseEnter} onMouseLeave={handleMouseLeave}></div>

     </>
  )
}

export default EventExample2