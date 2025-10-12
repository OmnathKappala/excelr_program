
f1();


function f1(){
    for(let i=0;i<=5;i++)
        document.write(i);

}
f1();
// --------------------------------------------------


function f2(value){
    for(let i=1;i<=5;i++){
        document.write(value+"");
    }
    document.write("<br>");
}
f2("*");
f2("$");
// ---------------------------
function table(num){
    for(let i=1;i<=10;i++){
        res=num*i;
        document.write(num+"*"+i+"="+res+"<br>");
    }
    document.write("<br>");
}
table(3);
// -------------------------



function isPrime (num){
    let count=0;
    for(let i=1;i<=num;i++){
        if(num%i==0){
            count++;
        }
    }
    return count==2;


}
isPrime(3)? console.log("is prime"):console.log("is not Prime");

 