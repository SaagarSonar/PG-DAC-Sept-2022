class pattern13 {
    //pattern type quetion
    public static void main(String args[]) {

        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'E'; j >= i; j--) {
                System.out.print(" ");
            }
            for (char j = 'A'; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
/*
output=
     A 
    B B 
   C C C 
  D D D D 
 E E E E E 

*/