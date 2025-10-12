let arr=[101,102,103,104,105];
 //map will process/manipulate each elemennt

 let arr2=arr.map((element)=>{
    return element+100;
 });
 console.log("before",arr);
 console.log("after",arr2);

 let even=arr.filter(
    (element)=>{
        return element%2==0;
    }
 );
 console.log(arr);
 console.log(even);

 let arr1=Array.from(arr);
 for(let i=0;i<arr1.length;i++){
    arr1[i]=arr[i]+100;
     
 }
 console.log(arr1);

 let sum=arr.reduce(
    (total,element)=>{
        return total + element;
    }
 ,0);
 console.log(sum);

 let result = arr.reduce((total, element) => total - element);
 console.log(result);

// maniplating functions
 let fruits=["banana","mango",'orange'];

 fruits.push('grape');
 console.log(fruits);

 fruits.pop();
 console.log(fruits);

 fruits.shift();
console.log(fruits);

fruits.unshift('pineapple');
console.log(fruits);

let colors=["red","green","blue",'yellow','black','white'];
console.log(colors.reverse());

console.log(colors.sort());


console.log(colors.includes('red'));
console.log(colors.includes('pink'));


console.log(colors.indexOf("red"));
console.log(colors.indexOf("orange"));

if("aeiou".indexOf('z')>0){
   console.log("voewl");
}
else{
   console.log("consonant");
}

let str="hello";
console.log(str.indexOf('l'));
console.log(str.lastIndexOf('l'));
 
let arr3=[10,20,30,40];
let every=arr3.every(
   (element ,index,array)=>{
      return element%2==0
   }

);
console.log(every);

let some=arr3.some(
   (element)=>{
      return element%2==0;
   }
);
console.log(some);


let find =arr3.findLast(
   (elemennt)=>{
      return elemennt%2==0;

   }
)
console.log(find);






