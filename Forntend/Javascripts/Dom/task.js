 function fetchdata() {
  fetch('https://fakestoreapi.com/products')
    .then(response => response.json())
    .then(data => {
      console.log(data);
      let body = document.querySelector("body");

      for (let i = 0; i < data.length; i++) {
        console.log(data[i]);
        let h2 = document.createElement("h2");
        h2.innerHTML = data[i].title;
        body.appendChild(h2);
      }
    })
    .catch(error => console.log("Error fetching data:", error));
}

fetchdata();