 import React from 'react'
import { LoginContext } from './LoginContext'

const LoginPage = () => {
    let obj = {
        username: 'likith@gmail.com',
        password: 'admin'
    }
    return (
        <>
            <div>LoginPage</div>

            <LoginContext.Provider value={obj}>
                <DashBoard />
            </LoginContext.Provider>
        </>
    )
}

const DashBoard = () => {
    let obj = {

    }
    return (
        <>
            <div>DashBoard</div>
            <NavBar />
        </>
    )
}

const NavBar = () => {
    let obj = {

    }
    return (
        <>
            <div>NavBar</div>
            <Profile />
            <Edit />
            <Delete />
        </>
    )
}

const Edit = () => {
    return (
        <>
            <button type="button" className="btn btn-warning">Edit</button>
        </>
    )
}

const Profile = () => {
    return (
        <button type="button" className="btn btn-success">Profile</button>
    )
}

const Delete = () => {
    function handleDelete() {
        alert('Deleted')
    }
    return (
        <>
            <button type="button" className="btn btn-danger" onClick={handleDelete}>Delete</button>
        </>
    )
}

export default LoginPage