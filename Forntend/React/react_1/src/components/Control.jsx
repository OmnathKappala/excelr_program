 import React from 'react'

const Controlled = () => { 
    let [data, setData] = React.useState("");
    let [msg, setMsg] = React.useState("weak password");
    let[color,setColor]=React.useState("blue");

    function collectData(event) {
        let value = event.target.value;
        setData(value);

        if (value.length >= 8) {
            if ('1234567890'.split('').some((num) => value.includes(num))) {
                if ('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'
                    .split('')
                    .some((char) => value.includes(char))) {
                    if (/[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?]/.test(value)) {
                        setMsg("strong password ");
                        setColor('green');
                    } else {
                        setMsg("password should contain special characters");
                        setColor('red');
                    }
                } else {
                    setMsg("password should contain characters");
                    setColor('red');
                }
            } else {
                setMsg("password should contain numbers");
                setColor(red);
            }
        } else {
            setMsg("length should be greater than 8 characters");
            setColor(color);
        }
    }

    return (
        <>
            {/* <div>{data}</div> */}
            <input style={{color:"purple"}} type="text" onChange={collectData} placeholder='enter password'  />
            <p style={{ color:  color }}>{msg}</p>
            
        </>
    )
}

export default Controlled