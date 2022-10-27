import java.util.*;
//Write_a_java_program_to_find_the_no._is_even_or_odd
class Q1
{
	public static void main (String args [])
	{
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter a no.");
	int num=sc.nextInt();

	if (num%2==0)
	{
		System.out.println("EVEN");
	}
	else 
	{
	System.out.println("ODD");
	}
	}
}