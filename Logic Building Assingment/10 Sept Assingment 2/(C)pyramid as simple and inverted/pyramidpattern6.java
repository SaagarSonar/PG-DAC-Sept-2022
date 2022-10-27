class pyramidpattern6{
//pattern type quetion
public static void main(String args[]){
	
	for(int i=9;i>=0;i--)
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
}/* output=
 *  *  *  *  *  *  *  *  *
  *  *  *  *  *  *  *  *
   *  *  *  *  *  *  *
    *  *  *  *  *  *
     *  *  *  *  *
      *  *  *  *
       *  *  *
        *  *
         *
*/