class starpattern7
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
     *
    ***
   *****
  *******
 *********
 *********
  *******
   *****
    ***
     *


 */