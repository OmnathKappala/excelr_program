import React from 'react'

const Presentation = (props) => {
     const {name,age,phone}=props.data;


  return (
    <>
    <div>Presentation</div>
    <p>Name: {name}</p>
    <p>Age: {age}</p>
    <p>Phone: {phone}</p>
    </>
  )
}

export default Presentation