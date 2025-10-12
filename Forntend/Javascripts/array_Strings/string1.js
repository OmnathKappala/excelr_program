let string="hello";
console.log(string);

console.log(string.length);
console.log(string[2]);
console.log(string[7]);

console.log(string.charAt(0));

console.log(string.toLocaleUpperCase());

let str=string.toLocaleUpperCase();
console.log(str.toLocaleLowerCase());

let str1='hello';
let str2='world';

console.log(str1+" "+str2);
console.log(str1.concat(str2));
console.log(`${str1} ${str2}`);

console.log(str.includes('l'));

let str3="hello world welcome to javascript";
let arr=str3.split(" ");
console.log(arr);

console.log(str1.split("l"));

console.log(str1.split(""));


let str4="java";
console.log(str4.padEnd(10,"script"));

console.log(str4.padStart(10,"noodles"));

console.log(str4.replace('java','python'));

console.log(str4.replace('j','m'));

console.log(str4.repeat(5));

let str5="hello world";
console.log(str5.startsWith('h'));

console.log(str5.endsWith('d'));

let str6="hello  ";
console.log(str6.length);

console.log(str6.trim());   // to remove the white spaces trim(),trimstart(),trimEnd()

console.log(str6.trim().length);

let str7="welcome";
console.log(str7.slice(0,3));
console.log(str7.slice(0));
console.log(str7.slice(0,str7.length-1));
console.log(str7.substring(0,3));


//printing vowels in a string
for(let i=0;i<str7.length;i++){
    if("aeiou".indexOf(str7[i])!=-1){
        console.log(str7[i]+" is a vowel");
    }
}


let arr2=[1,2,3,4,5];
let arr3=[6,7,8,9];
console.log(arr2.concat(arr3));

let arr4=[...arr2,...arr3];
console.log(arr4);

console.log(arr2.slice(1,4));
let copied=Array.from(arr2);

console.log(arr2);
let res4=copied.splice(0,3,"t");
console.log(res4);
console.log(copied);


console.log(copied);

console.log([101,102,3,4,5].splice(0,4)); 

console.log(['A','B','C','D'].join(":"));









