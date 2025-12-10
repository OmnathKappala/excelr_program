import { configureStore, createStore } from "@reduxjs/toolkit";
function reducer(state={count:0},action){
    switch(action.type){
        case "incerment":
            return {count:state.count+1}
        case "decrement":
            return {count:state.count-1}
        case "incermentby2s":    
            return {count:state.count+1}
        case "decrementby2s":
            return {count:state.count-1}
        default:
            return state
    }

}

// export const countStore=createStore(reducer);
export const countStore=configureStore({reducer});