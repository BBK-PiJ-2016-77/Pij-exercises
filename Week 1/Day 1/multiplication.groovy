println "give me the first number : "
int num1 = Integer.parseInt(System.console().readLine())
println "give me the second number : "
int num2 = Integer.parseInt(System.console().readLine())
int result = 0
int times = 1
while (times<= num2){
	 result = result + num1;
	 times++
	 
}
println "the result of the multiplication is " +result