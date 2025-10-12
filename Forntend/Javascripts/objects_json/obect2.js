let product= {
      "id": 2,
      "title": "Eyeshadow Palette with Mirror",
      "description": "The Eyeshadow Palette with Mirror offers a versatile range of eyeshadow shades for creating stunning eye looks. With a built-in mirror, it's convenient for on-the-go makeup application.",
      "category": "beauty",
      "price": 19.99,
      "discountPercentage": 18.19,
      "rating": 2.86,
      "stock": 34,
      "tags": [
        "beauty",
        "eyeshadow"
      ],
      "brand": "Glamour Beauty",
      "sku": "BEA-GLA-EYE-002",
      "weight": 9,
      "dimensions": {
        "width": 9.26,
        "height": 22.47,
        "depth": 27.67
      },
      "warrantyInformation": "1 year warranty",
      "shippingInformation": "Ships in 2 weeks",
      "availabilityStatus": "In Stock",
      "reviews": [
        {
          "rating": 5,
          "comment": "Great product!",
          "date": "2025-04-30T09:41:02.053Z",
          "reviewerName": "Savannah Gomez",
          "reviewerEmail": "savannah.gomez@x.dummyjson.com"
        },
        {
          "rating": 4,
          "comment": "Awesome product!",
          "date": "2025-04-30T09:41:02.053Z",
          "reviewerName": "Christian Perez",
          "reviewerEmail": "christian.perez@x.dummyjson.com"
        },
        {
          "rating": 1,
          "comment": "Poor quality!",
          "date": "2025-04-30T09:41:02.053Z",
          "reviewerName": "Nicholas Bailey",
          "reviewerEmail": "nicholas.bailey@x.dummyjson.com"
        }
      ],
      "returnPolicy": "7 days return policy",
      "minimumOrderQuantity": 20,
      "meta": {
        "createdAt": "2025-04-30T09:41:02.053Z",
        "updatedAt": "2025-04-30T09:41:02.053Z",
        "barcode": "9170275171413",
        "qrCode": "https://cdn.dummyjson.com/public/qr-code.png"
      },
      "images": [
        "https://cdn.dummyjson.com/product-images/beauty/eyeshadow-palette-with-mirror/1.webp"
      ],
      "thumbnail": "https://cdn.dummyjson.com/product-images/beauty/eyeshadow-palette-with-mirror/thumbnail.webp"
    }

// acessing object values
// print title
    console.log(product.title);
    console.log(product["title"]);
    console.log(product.dimensions.height);

    // printing only keys 
    let keys=Object.keys(product);
    console.log(keys);
    //  for values 
    let values=Object.values(product);
    console.log(values);

    // for key-value pair(enteries)- array
    let entries=Object.entries(product);
    console.log(entries);







    // manipulation
    product.title="balck i shadow";
    console.log(product.title);

    console.log(product);


    let arr=[10,20,30,40];
    console.log(arr);


    // creating a new object using prototype from old object

    let newProduct=Object.create(product);
    console.log(newProduct);
    console.log(newProduct.title);



    let Person={
        name:'raj',
        age:34,
        phone:123456,

        details:function(){
            console.log("the person name is",this.name,"and age is",this.age);
        }

    }
     Person.__proto__.gender= 'male';

    console.log(Person);




    console.log(Person);
    let person=Object.create(Person);
    console.log(person);
    console.log(person.name);
    person.details();

    
