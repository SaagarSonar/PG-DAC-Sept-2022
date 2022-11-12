class pyramidpattern4
{
    public static void main(String[] args)
    {
        int count = 1;
        for(int i = 1; i <= 9; i++)
        {
            for(int j = i; j<= 8; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            for(int j = count-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            count++;
        }
    }
}
/*
output=
                1 
              1 2 1 
            1 2 3 2 1 
          1 2 3 4 3 2 1 
        1 2 3 4 5 4 3 2 1 
      1 2 3 4 5 6 5 4 3 2 1 
    1 2 3 4 5 6 7 6 5 4 3 2 1 
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 

 */