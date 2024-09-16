package LambdaAssignFactorial;

public class MainFact {
public static void main(String args[]) {
	Factorial val=(num)->{
		 int i,fact=1;  
		  //It is the number to calculate factorial    
		  for(i=1;i<=num;i++){    
		      fact=fact*i;    
		  }  
		  return fact;
	};
	System.out.println(val.fact(6));
	Factclass f=new Factclass();
	Factorial val2=f::fact;
	System.out.println(val2.fact(9));
}
}
