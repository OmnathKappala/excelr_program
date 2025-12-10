import React from 'react'
// import"../App.css"
// import "../index.css"
import { useRef } from 'react'
import { useNavigate } from 'react-router-dom'

const Login = () => {
    let email = useRef(null);
    let password=useRef(null);
    let navigate=useNavigate();
    function handleSubmit(){
        let userEmail=email.current.value;
        let userPassword=password.current.value;
        if(userEmail == "admin@gmail.com" && userPassword == "12345"){
            alert("login successfully");
            navigate('/dashboard');
        }
        else{
            alert("login failed");
            navigate('/error');

        }
    }
  return (
    <>
     <input type="text"  placeholder='enter your email' ref={email}/> <br /><br />
     <input type="password" placeholder='enter your password' ref={password}/><br /><br />
     <button onClick={handleSubmit}>Login</button>
     </>
  )
}

export default Login