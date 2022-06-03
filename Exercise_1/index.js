function missingValue(num){
  const max = Math.max(...num); // maximum number in the sequence
  const min = Math.min(...num); // minimum number in the sequence
  const missingNum = []

  for(let i=min; i<= max; i++) {
    if(!num.includes(i)) { // Checking whether i(current value) present in num(argument)
      missingNum.push(i); // push the missing number
      console.log("Missing value is: " + i);
    }
  }

  //If the missing number is starting one or end one
  if(missingNum.length < 1){

    missingNum.push(min-1);
    missingNum.push(max+1);

    console.log("Starting value is : "+ missingNum[0]);
    console.log("Ending value is : "+ missingNum[1]);
  }

  return missingNum;
}

console.log("Missing value of [2,3,5,4,6,7,8,9] Where")
missingValue([2,3,5,4,6,7,8,9]);

console.log("======================================================")

console.log("Missing value of [21,25,29,28,22,24,27,26,30]") 
missingValue([21,25,29,28,22,24,27,26,30]);
