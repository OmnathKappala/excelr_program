let age =18;
let gender="male";

  

// else if or of-else statement.
// if(age>=18){
//     if(gender=="male"){
//         console.log(' enteri Q1');
//     }
//     else{
//         console.log(' enteri Q2');
//     }
// }
// else{
//     console.log('you can not vote');
// }

//  let weekday = prompt("enter the weekday");

// if (weekday === 'monday') {
//     console.log("today is monday... idly...!!!");
// } else if (weekday === 'tuesday') {
//     console.log("today is tuesday... pongal...");
// } else if (weekday === 'wednesday') {

//     console.log("today is wednesday... lemon rice...");
// } else if (weekday === 'thursday') {
//     console.log("today is thursday... uttapam...");
// } else if (weekday === 'friday') {
//     console.log("today is friday... upma...");
// } else if (weekday === 'saturday') {
//     console.log("today is saturday... puri...");
// } else {
//     console.log("invalid day");
// 
   let choice=prompt("enter the choice /n1.Kids wear"+"\n2.Men wear"+"\n3.Women wear"+"\n4.Sports wear"); 
   let key=parseInt(choice);
   switch(key){
       case 1:
       console.log("kids wear");
       break;
       case 2:
       console.log("men wear");
       break;
       case 3:
       console.log("women wear");
       break;
       case 4:
       console.log("sports wear");
       break;
       default:
       console.log("invalid choice");
   }

 