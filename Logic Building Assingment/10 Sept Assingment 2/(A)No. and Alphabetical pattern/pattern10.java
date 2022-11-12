class pattern10
{
    public static void main(String[] args)
    {
        char count;

        for(char i = 'E'; i >= 'A'; i--){
            count = i;
            for( char j = 'A'; j < i; j++){
                System.out.print("  ");
            }
            for(char j = 'E'; j >= i; j--){
                System.out.print(count+"  ");
                count++;
            }

            System.out.println();

        }

    }
}
/*
output=
        E
      D  E
    C  D  E
  B  C  D  E
A  B  C  D  E

*/