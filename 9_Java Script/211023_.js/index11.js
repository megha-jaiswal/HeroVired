var a= undefined;
// var b= undefined;
// var c= undefined;
//global object : window
// this: it refere to whichever object it is in

//global execution context- 2 phases 
//memory allocation phase & execution phase

// js track and remember its variable name not its value. 
//js also tracks its function
//undefined is the special keyword which is used as placeholder for memory allocation
//1st phase: Memory allocation: Hoisting
//hoisting : moving all the variable and function to the top of global scope
// console.log(a);
// var a=20;
// console.log(a);

// //in var redeclaration  & reinitialization is possible;
// // console.log(b);
// // let cannot be used before its initialize . let allows to reinitialze but cannot be redeclaration.
// //Temporal dead zone: TDZ, zone where you cannot access let variable.
// let b=10; 
// b=20;
// console.log(b);

// // const- constant - neither redeclaration nor reinitialization 
// const c=10;
// c=20;
// console.log(c);

console.log(fun); // function can be call anywhere in the code.
function fun(){  // name function 
    let a=20;
}

//In JS, they are treated as first class citizen or first class object;
//because, in js function can be stored inside a variable , they can also be trated as a
//arguments to another function ( basis of call back function)  and at the same time they can returned from a function.  

// Anonymous function
//functional expression:where function is stored in variable.
let a= function(){

}

//Arrow function: ES6 function
//functional expression
const b= ()=>{

}

//IIFE: immediately invoked funtional expression;
// (
//     ()=>{
//         //logix space
//     }
// )() // can be called only once, where it is writtern. 

// console.log(a);
// var a=function (a,b){
//     let c=a+b;
//     return c;
// }

//JS is single threaded and synchronous language.