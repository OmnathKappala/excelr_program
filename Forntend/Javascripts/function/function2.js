// ---------------function declarations or general functions or named functions
operations();
function operations(){
    console.log("operations - function declaration or named function or genral function");
}
operations();


// -----------------function expression or anonymous function-----------------------------------

let operation1=function(){
    console.log(" operations1-function expression or anonymous function");
}
operation1();
// operation3
let operation3=()=>{
    console.log(" operations3-function expression or anonymous function");
}
operation3();


// IIFE --- Immediatley invocked function expression

(function operations(){
    console.log("operations4 - IIFE");
})();

// ------------------call back functions---------------------


let userName='admin';
let password='admin123';

 function authenticate(parameter1,parameter2,parameter3,parameter4){
    if(parameter1===userName && parameter2===password){
        parameter3();
    }
    else {
        parameter4();
    }

 }
 function isSucess(){
    console.log("authentication is Sucessfull...");
    console.log("welcome to home page \n1 home \n2 dashbord \n3 login");



 }
 function isfailure(){
    console.log("authentication is fail check creditnals......")

 }
 authenticate(userName,password,isSucess ,isfailure);

//  ------------------higher order functions------------------

function add(a,b){
    return a+b;
}
function sub(a,b){
    return a-b;
}
function mul(a,b){
    return a*b;
}
function div(a,b){ 
    return a/b;
}
function calculate(a,b,operation){
    return operation(a,b);
}
console.log(calculate(10,20,add));
console.log(calculate(10,20,sub));
console.log(calculate(10,20,mul));
console.log(calculate(10,20,div));



// constructor function - represents a real world entity
function Person(name,age,phone){
    this.name=name;
    this.age=age;
    this.phone=phone;
    


}
let p1=new Person('raj',34,1234);
console.log(p1);


// generator function 

function* generator(){
    yield 1;
    yield 2;
    yield 3;
    yield 4;

}
let gen=generator();
console.log(gen);
console.log(gen.next().value);
console.log(gen.next());
console.log(gen.next());
console.log(gen.next());



function* idGenerator(){
    let id=1;
    while(id<=50){
        yield "EXCELR "+id;
        id++;
    }
}
let id=idGenerator();
 for(let i=1;i<=50;i++){
    console.log(id.next().value);
 }


 
 








