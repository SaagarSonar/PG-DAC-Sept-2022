//WAP in java for whether a Year is leap year or Not.
import java.util.*;
class Q6leapYear
	{
	 public static void main(String args [])
	 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter A Year");
	 int num=sc.nextInt();
	 
	 if (num%100==0)
	 {
		 if(num%400==0) 
		 {
		 System.out.println("Given Year Is Leap Year");
		 }
		
	 }
	 else if(num%4==0)
		{
			System.out.println("Given Year Is Leap Year");
		}
	 else
	 System.out.println("Given Year Is Not A Leap Year");
	
	 }
	}