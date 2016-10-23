println "give me the first number : "
int num1 = Integer.parseInt(System.console().readLine())

println "give me the second number : "
int num2 = Integer.parseInt(System.console().readLine())

if (num2==0){
	println "error"
	return
}

int calc = 1 ;
int reminder = 0 ;

int result = num1 - num2 ; 
println "result " + result ;

if (result < 0) {
	calc = 0 ;
	reminder = num1 ;

} else if (result < num2) {
	
	reminder = num1 - num2 ;
			
}	
while (result >= num2){
	
	result = result - num2;
	calc++;
	
}
reminder = num1 - (num2 *calc);
		
println "the result of the division is " +calc+ " and the reminder is " +reminder