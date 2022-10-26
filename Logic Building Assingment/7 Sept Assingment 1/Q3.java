// wap in java of factorial using recusrsion.
import java.util.*;
class Q3
{  
  static int factorial(int n)
  {    
	  if (n == 0)    
		return 1;    
	  else    
		return(n * factorial(n-1));    
  } 
  
	 public static void main(String args[])
	 {  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter any no.");
	  int num=sc.nextInt();
	  
	  int i,res=1;  
	      
	  res = factorial(num);   
	  System.out.println("Factorial of "+num+" is: "+res);    
	 }  
}  