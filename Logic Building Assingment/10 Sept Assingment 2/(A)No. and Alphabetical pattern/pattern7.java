class pattern7{
//pattern type quetion
public static void main(String args[]){
	
	for(int i=0;i<=5;i++)
	{
		for (int j=4;j>=i;j--)
		{
			System.out.print(" ");
		}	
		for(int j=1;j<=i;j++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}
/*
output=
   1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 

*/