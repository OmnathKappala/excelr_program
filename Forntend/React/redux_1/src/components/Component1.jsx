import React from 'react'
import { useDispatch, useSelector } from 'react-redux'

const Component1 = () => {
    
       let dispatch= useDispatch();
      let count= useSelector(state=>state.count)

    function incerment(){
        setTimeout(() => {
            dispatch({type:"incerment"})
            
        },2000)
        

    }
    function decrement(){
        setTimeout(() => {
            
              dispatch({type:"decrement"})
        },2000)
      

    }
     
   
       
    
  return (
    <>
    <h1>Component 1 Count : {count}</h1>
    <button className='btn btn-success' onClick={incerment}>+ </button>
    <button className='btn btn-danger' onClick={decrement}>-</button>
    <button className='btn btn-success' onClick={incerment}>Increment By 2s</button>
    </>
  )
}

export default Component1