class pattern11
{
    public static void main (String args[])
    {
        for (int i=1;i<=5;i++)//row
        {
            for (int j=5;j>=i;j--)//spaces
            {
                System.out.print(" ");
            }
            for (int k=1;k<(i*2);k++)//column
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