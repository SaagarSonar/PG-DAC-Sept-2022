class starpattern6
{
    public static void main (String args[])
    {
        for (int i=1;i<=5;i++)//row
        {
            for(int j=1;j<=i;j++)//spaces
            {
                System.out.print(" ");
            }
            for(int k=5;k>=i;k--)//star
            {
                System.out.print("*");
            }
            for(int l=4;l>=i;l--)//star
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
output=
 *********
  *******
   *****
    ***
     *
 */