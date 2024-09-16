package LambdaAssignFactorial;

public class Factclass {
public int fact(int num) {
	 int i,fact=1;  
	  //It is the number to calculate factorial    
	  for(i=1;i<=num;i++){    
	      fact=fact*i;    
	  }  
	  return fact;
}
}
