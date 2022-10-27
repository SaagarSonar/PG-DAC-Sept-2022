class pyramidpattern4{
//pattern type quetion
public static void main(String args[]){
	
	for(int i=1;i<=4;i++) //row
	{
		for (int j=3;j>=i;j--)//space
		{
			System.out.print(" ");
		}	
		for(int j=1;j<=i;j++)//col
		{
			System.out.print(j+" ");
		
	}
	for(int j=1;j<i;j++)//space
		{
			System.out.print(j+" ");
		}
		System.out.println();
}
}
}
     /*  1
       1 2 1
      1 2 3 1 2
     1 2 3 4 1 2 3
    1 2 3 4 5 1 2 3 4
   1 2 3 4 5 6 1 2 3 4 5
  1 2 3 4 5 6 7 1 2 3 4 5 6
 1 2 3 4 5 6 7 8 1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8
*/