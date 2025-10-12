 let h1 = document.getElementById("h1");
h1.innerHTML = 'hello world';

// Fixing the style assignment inside the loop
let div1 = document.getElementsByClassName('div2');
for (let i = 0; i < div1.length; i++) {
    div1[i].innerHTML = '<b>hello world</b>';
    div1[i].style.color = 'red'; // Corrected this line
}

let p = document.getElementsByTagName('p');
p[0].innerHTML = '<b>hello world</b>';
p[0].style.color = 'red';

// let selector - first match

let selector=document.querySelector('.div2');
selector.style.backgroundColor='green';


//selector-all matches

let selectorAll=document.querySelectorAll('.div2');
for(let i=0;i<selectorAll.length;i++){
    selectorAll[i].style.border ='1px solid red';
}
