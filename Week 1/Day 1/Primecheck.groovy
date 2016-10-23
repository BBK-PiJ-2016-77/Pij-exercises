print ("give me an Integer and I will tell you if it's Prime :  ") ;
int i = Integer.parseInt(System.console().readLine()) ;
int k=2 
String result = ""
while (i>k) {
	if(i%k == 0) {
		result = "not"
		break
	} else {
		
		k++ ;
	}


}
println "The number "+i+ " is "+result+" a prime number"
