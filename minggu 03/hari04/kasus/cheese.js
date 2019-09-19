pagar = ""
for (let number = 0; number <= 8; number += 1) {
  for (let j=0; j<8; j+=1)
    {
    	if (number % 2!= 0) {
    		if (j % 2 != 0) {
    			pagar += " "
	    	}else{
	        	pagar += "#"
	    	}
    	}else{
    		if (j % 2 == 0) {
    			pagar += " "
	    	}else{
	        	pagar += "#"
	    	}
    	}
    	
    }
    console.log(pagar);
    pagar ="";
}