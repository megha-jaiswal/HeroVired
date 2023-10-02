var n1="null"; // null string is assigned//
var n1 = null; // doesn't have any value//
var n2 = undefined; // value is not defined//
console.log(typeof(n1)); // null/object//
console.log(typeof(n2)); //undefined//
var arr1= [23,24,56,89];
console.log(arr1);
var obj1={
    "name": "Megha",
    "age" : "34",
    "salary": "10000"
}
console.log(obj1);

function createG(name){
    return "Hello" + name;
    }

    function display(randomFunction, userName){ //passing function in argument//
        return randomFunction(userName); //returning a function //
    }
    var result= display(createG, "PPPP");
    alert(result);