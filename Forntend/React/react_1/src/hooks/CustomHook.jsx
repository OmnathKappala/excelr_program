import React from 'react'
 import useFetchData from './useFetchData';
const CustomHook = () => {
 let users  = useFetchData('https://fakestoreapi.com/users');
 console.log('users',users);
 let products=useFetchData('https://fakestoreapi.com/products');
 console.log('Products',products);















//     function fetchUser(){
//         fetch('https://fakestoreapi.com/users')
//   .then(response => response.json())
//   .then(data => console.log(data));

//     }
//     function fetchProduct(){
//         fetch('https://fakestoreapi.com/products')
//   .then(response => response.json())
//   .then(data => console.log(data));

//     }
//     fetchUser();
// fetchProduct();
  return (
    <div>CustomHook</div>
  )
}


export default CustomHook