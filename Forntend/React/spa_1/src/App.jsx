 import React from 'react'
import Login from './components/Login'
import { BrowserRouter } from 'react-router-dom'
import { Route, Routes } from 'react-router-dom'
 import Error from './components/Error'
import Dashboard from './components/Dashboard'
import Users from './components/Users'
import Products from './components/Products'
 import Edit from './components/Edit'
 const App = () => {
   return (
      <>
      <BrowserRouter>
       <Routes>
        <Route path='/' element={<Login/>}></Route>
         <Route path='/error' element={<Error/>}></Route>
         <Route path='/dashboard' element={<Dashboard/>}>
         <Route path='/dashboard/users' element={<Users/>}></Route>
         <Route path='/dashboard/products' element={<Products/>}></Route>
         </Route>
         {/* <Route path='/dashboard/products/edit/:id' element={<Edit/>}></Route> */}
             <Route path='/dashboard/products/edit' element={<Edit/>}></Route>
       </Routes>
      </BrowserRouter>
      </>
   )
 }
 
 export default App