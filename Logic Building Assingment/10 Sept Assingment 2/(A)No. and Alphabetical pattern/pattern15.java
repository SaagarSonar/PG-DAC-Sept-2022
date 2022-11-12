class pattern15
{
    public static void main (String args[])
    {
        for (int i=1;i<=5;i++)//row
        {
            for(int j=5;j>=i;j--)//col
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*
output=
5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 
*/
