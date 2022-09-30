// ---------Variables--------------

//Create variables
var firstName = 'Nimesh';
var lastName = 'Mendis';
var age = 24;
var isOk = true;

var job, height;

//Print only variable
console.log(firstName);
//Print the variable with a string
console.log('My name is ' + lastName);
//Type coercion
console.log('My age is ' + age);
console.log('It is ' + isOk);

console.log('I am a ' + job);

//Get variable type
console.log(typeof (firstName));
console.log(typeof (lastName));
console.log(typeof (age));
console.log(typeof (isOk));
console.log(typeof (job));

//Define
job = 'Doctor';

//Variable mutation
lastName = 'Tissera';
console.log('I am ' + lastName + ' I am a ' + job);

//Display an alert
alert('My name is ' + lastName + ' I am ' + age + ' years old. And am i okay? ' + isOk);

//Get user input
height = prompt('What is your height?');
alert('My height is ' + height + ' feet.');