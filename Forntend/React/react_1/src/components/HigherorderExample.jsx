import React from 'react'

const HigherorderExample = (WrappedComponent) => {
    return function(props){

    
  return (
    <>
    <h1>higher Oder Example</h1>
    <WrappedComponent{...props} name={"rahul"} age={24} phone={1234567890}/>
    </>
  )
}
}

export default HigherorderExample