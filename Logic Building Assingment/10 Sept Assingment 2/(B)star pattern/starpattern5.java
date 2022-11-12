class starpattern5
{
    public static void main (String args[])
    {
        for (int i=1;i<=5;i++)//row
        {
            for (int j=5;j>=i;j--)//spaces
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)//column
            {
                System.out.print("*");
            }
            for (int m=2;m<=i;m++)
            {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
/*
output=
     *
    ***
   *****
  *******
 *********

 */