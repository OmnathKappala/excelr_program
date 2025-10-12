let arr=[10,20,30,40];
console.log(arr);
console.log(arr[2]);
console.log(arr[5]);
console.log("size of the array",arr.length);

let arr2=[10,'A' ,"hello",true,{name:"raj"} ];
console.log(arr2);
console.log(arr2.length);

arr2[2]="bye";
arr2[6]="welcome";

console.log(arr2);
console.log(arr2.length);

let arr3=[101,102,103,104,105,106,107,108,109,110];
for(let i=0;i<arr3.length;i++){
     document.write(arr3[i]+",");
}
document.write("<br>")

let i=0;
while(i<arr3.length){
    document.write(arr3[i]+",");
    i++;
}

document.write("<br>");

for (const key in arr) {
    document.write(key+"-"+arr[key]+"<br>");



     
    
    
}
for (const element of arr3) {
    document.write(element+"<br>");
    
}


let arr5=new Array(10,20,30,40,50);
console.log(arr5);


let arr6=new Array(10);
console.log(arr6);

let arr7=Array.from(arr5);
console.log(arr7);


let arr8=Array.of(10,20);
console.log(arr8);
