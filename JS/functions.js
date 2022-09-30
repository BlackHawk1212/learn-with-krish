//Define functions

//Without return

function addNumbers(num1, num2) {
    var ans = num1 + num2;
    console.log('Addition: ' + ans);
}

//With return
function subNumbers(num1, num2) {
    //Retrun the value to where we called the function
    //Exit the function
    return num1 - num2;
}

//Calling the function
addNumbers(20, 32.5);
var sub = subNumbers(100, 50);
console.log('Substraction: ' + sub);
