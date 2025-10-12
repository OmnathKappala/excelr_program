
let fruits = ['banana', 'apple', 'orange', 'grape', 'kiwi'];
let ul = document.querySelector('ul');

for (let i = 0; i < fruits.length; i++) {
    let li = document.createElement('li');
    li.innerHTML = fruits[i];
    ul.appendChild(li); // ✅ Correct method
}

let parent = document.getElementById("parent");

let child1= document.createElement("div");
child1.innerHTML = "child1";
parent.appendChild(child1);//add at end

let child2=document.createElement('div');
child2.innerHTML = 'child2';

parent.prepend(child2); // add at the start 


let child=document.getElementById('child');
parent.removeChild(child);

let before=document.createElement('div');
before.innerHTML='before';
parent.insertBefore(before,child2);
