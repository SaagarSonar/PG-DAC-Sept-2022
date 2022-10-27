//swap two no. without using third variable approach
import java.util.*;
class Q4
{
	public static void main(String [] args)
	{
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter value of a");
		 int  a=sc.nextInt();
		 System.out.println("Enter value of b");
		 int  b=sc.nextInt();
		
    	 int A,B;
		 A=a-b;
		 B=a+b;
		 A=B-a;
		 B=B-b;
		  
	    System.out.println("value of a="+A);
		System.out.println("value of b="+B);
  
    }
}