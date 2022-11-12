class pattern8
{
    public static void main(String[] args)
    {
        int count;

        for(int i = 5; i >= 1; i--){
            count = i;
            for( int j = 1; j < i; j++){
                System.out.print("  ");
            }
            for(int j = 5; j >= i; j--){
                System.out.print(count+"  ");
                count++;
            }

            System.out.println();

        }

    }
}
/*
output=
        5  
      4  5  
    3  4  5  
  2  3  4  5  
1  2  3  4  5  


*/