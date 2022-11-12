class pyramidpattern1 {
    //pattern type quetion
    public static void main(String args[]) {

        for (int i = 0; i <= 9; i++) {
            for (int j = 8; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
/*
output=

        1 
       2 2 
      3 3 3 
     4 4 4 4 
    5 5 5 5 5 
   6 6 6 6 6 6 
  7 7 7 7 7 7 7 
 8 8 8 8 8 8 8 8 
9 9 9 9 9 9 9 9 9 

Process finished with exit code 0


*/