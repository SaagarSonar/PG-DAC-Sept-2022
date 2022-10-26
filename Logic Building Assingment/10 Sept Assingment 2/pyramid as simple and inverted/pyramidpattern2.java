class pyramidpattern2{ 
public static void main(String args[]){
	//pyramid pattern 2
	for(int i=0;i<=9;i++)
	{
		for (int j=8;j>=i;j--)
		{
			System.out.print(" ");
		}	
		for(int j=1;j<=i;j++)
		{
			System.out.print(" * ");
		}
		System.out.println();
	}
	
} 
}/*output=
        1
       1 2
      1 2 3
     1 2 3 4
    1 2 3 4 5
   1 2 3 4 5 6
  1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9
*/