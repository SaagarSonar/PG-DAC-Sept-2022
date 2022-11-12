class starpattern4
{
    public static void main (String args[])
    {
        for (int i=1;i<=5;i++)//row
        {
            for (int j=1;j<=i;j++)//spaces
            {
                System.out.print(" ");
            }
            for (int k=5;k>=i;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
output=

 *****
  ****
   ***
    **
     *

*/
