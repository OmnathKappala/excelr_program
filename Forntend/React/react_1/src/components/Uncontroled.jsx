import React from 'react'

const Uncontroled = () => {
    let name=React.useRef(null);
    let email=React.useRef(null);

    function handleSumbit(){
        console.log(name);
        console.log("enter a name is :" + name.current.value);
        console.log(email);
        console.log("enter a email :" +email.current.value);

    }
  return (
    <>
    <input type="text" placeholder ='enter a name' ref={name}/><br /><br />
    <input type="text" placeholder='enter a email'  ref={email}/><br /><br />
    <button onClick={handleSumbit}>Submit</button>
    </>
  )
}

export default Uncontroled
 