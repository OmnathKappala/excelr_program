import React from 'react'

export const Child = (props) => {
    let data=props.d1;
    console.log(props);
    

  return (
     <div>
        <div>In child Component</div>
        <h1>{data}</h1>
     </div>

  )
}
export default Child
