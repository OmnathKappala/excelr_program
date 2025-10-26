import React from 'react'
import Presentation from './Presentation'

const Container = () => {
    let obj={
        name:"hello",
        age:20,
        phone:123456789

    }
  return (
    <>
    {/* <div>Container</div> */}
    <Presentation data={obj}/>
    </>
  )
}

export default Container