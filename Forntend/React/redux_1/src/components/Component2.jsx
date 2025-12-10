 import React from 'react'
import { useDispatch, useSelector } from 'react-redux'

const Component2 = () => {
    
       let dispatch= useDispatch();
      let count= useSelector(state=>state.count)

    function incerment(){
        dispatch({type:"incerment"})

    }
    function decrement(){
        dispatch({type:"decrement"})

    }
    
  return (
    <>
    <h1>Component 2 Count : {count}</h1>
    <button className='btn btn-success' onClick={incerment}>+ </button>
    <button className='btn btn-danger' onClick={decrement}>-</button>
    <button className='btn btn-danger' onClick={decrement}>decrement By 2</button>
    </>
  )
}

export default Component2