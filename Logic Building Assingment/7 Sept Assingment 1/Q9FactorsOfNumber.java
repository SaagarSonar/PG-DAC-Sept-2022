//Find all factors of a given number
import java.util.Scanner;
class Q9FactorsOfNumber
{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	
	for(int i=2; i<=num; i++)
	{
		while(num%i==0)
		{
			System.out.print(" "+i+",");
			num=num/i;
		}
	}
	
		

}
}

