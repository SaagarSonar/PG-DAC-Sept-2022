// factorial of given no.
import java.util.*;
class Q2factorialOfNumber
{
public static void main (String args [])
   {
      Scanner sc =new Scanner (System.in);
      System.out.println("Enter a no.");
	  
      int num=sc.nextInt();
      int res,i;
      res=1;
	   
      for (i=1;i<=num;i++)
	  res=res*i;
      System.out.println("factorial of given no.="+res);
	  
}
}
