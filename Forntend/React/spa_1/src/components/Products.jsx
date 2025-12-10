 import axios from 'axios';
import React, { useEffect } from 'react'
import './Product.css'
import { Link } from 'react-router-dom';
const Products = () => {
let[products,setProducts]=React.useState([]);
  useEffect(
    () => {
      axios.get('https://fakestoreapi.com/products')
      .then(response => {
        console.log(response.data);
        setProducts(response.data)});
    },[]
  )
  function handleDelete(id){
    alert('delete'+id);
//     fetch('https://fakestoreapi.com/products/1', {
//   method: 'DELETE'
// })
//   .then(response => response.json())
//   .then(data => console.log(data));
axios.delete(`https://fakestoreapi.com/products/1`)
   .then(res=>{
    if(res.status==200){
      alert("Deleted Sucessfully " +res.data.title);
      window.location.reload()
    }
   });


  }


  return (
     <div className='container'>
      {
        products.map((product)=><div key={product.id} className='item'>
           <img src={product.image} alt="" />
          <div>NAME: <b>{product.title.slice(0,20)}</b> </div>
          <div>PRICE: <b>{product.price}</b></div>
          <div>DESCRIPTION: <b>{product.description.slice(0,50)}</b></div>
          <span>RATING: <b>{product.rating.rate}</b></span>
          <br />
          {/* path parameters --dashboard/products/edit/1 */}
           {/* <Link className='btn btn-outline-warning' to={'/dashboard/products/edit/'+product.id}>Edit</Link> */}
            <Link className='btn btn-outline-warning' to={'/dashboard/products/edit?id='+product.id}>Edit</Link>

          <button className='btn btn-outline-danger' onClick={()=>handleDelete(product.id)}>Delete</button>
        </div>)
      }


     </div>
  )
}

export default Products