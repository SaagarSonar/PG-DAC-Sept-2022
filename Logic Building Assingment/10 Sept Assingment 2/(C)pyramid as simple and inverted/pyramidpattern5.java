 class pyramidpattern5
 {
    public static void main(String[] args)
	{
        int count = 9, count1;

        for(int i = 1; i <= 9; i++)
		{
            count1 = 9-1;
            for(int j = i; j <= 9; j++)
			{
                System.out.print("  ");
            }
            for(int j = count; j <= 9; j++)
			{
                System.out.print(j+" ");
            }
            for(int j = 1; j < i; j++)
			{
                System.out.print(count1+" ");
                count1--;
            }
            System.out.println();
            count--;
        }
    }
}


/*
output=
                 9 
                8 9 8 
              7 8 9 8 7 
            6 7 8 9 8 7 6 
          5 6 7 8 9 8 7 6 5 
        4 5 6 7 8 9 8 7 6 5 4 
      3 4 5 6 7 8 9 8 7 6 5 4 3 
    2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 

 */