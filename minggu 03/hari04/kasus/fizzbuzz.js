for (let number = 0; number <= 100; number+= 1) {
  if (number % 15 == 0) {
  	console.log("fizz");
  }else if (number % 5 == 0) {
  	console.log("buzz");
  }else if(number % 3 == 0){
  	console.log("fizzbuzz")
  }else{
  	console.log(number);
  }
 }