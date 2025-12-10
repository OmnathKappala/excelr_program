// import React, { useState } from 'react'

// const ReducerExample = () => {
//     let [count , setCount]=useState(0);
//     function increment(){
//         setCount(count+1);

//     }
//     function decrement(){
//         setCount(count-1);
//     }

    

//   return (
//     <>
//     <button className='btn btn-success' onClick={increment}>+</button>
//     {count}
//     <button className='btn btn-danger'onClick={decrement}>-</button>

//     </>
//   )
// }

// export default ReducerExample






import React from 'react'
import { useReducer } from 'react'

const ReducerExample = () => {
    function reducer(state,action){
        switch(action.type){
            case 'increment':
                return {count:state.count+1}
            case 'decrement':
                return {count:state.count-1}
            case 'incrementby5':
                return {count:state.count+5}
             case 'decrementby2s':
                return {count:state.count-1}       
            default:
                return state;
        }

    }
   let [state,dispatch] =useReducer(reducer,{count:0});
   function increment(){
    dispatch({type:'increment'})

   }
   function decrement(){
    
        dispatch({type:'decrementby'})
    

  

   }
   function incrementby5(){
    dispatch({type:'incrementby5'})
   }
   function decrementby2s(){
    setTimeout(() => {
         dispatch({type:'decrementby2s'})
        
    },2000);
   
   }
  return (
    
    <>
    {state.count} <br />
    <button className='btn btn-danger'onClick={decrementby2s}>Decrement by 2s</button>
    <button className='btn btn-success' onClick={increment} >+</button>
   
    <button className='btn btn-danger'onClick={decrement} >-</button>
    <button className='btn btn-success' onClick={incrementby5}> Incerement By 5</button>
    
    </>
  )
}

export default ReducerExample