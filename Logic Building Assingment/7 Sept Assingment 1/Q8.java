//To print digits of a given number
import java.util.*;
import java.io.*;
 
class Q8 {
 
    
    public static void main(String[] args)
    {
         
        int number = 10110;
 
            while (number > 0) {
 
            int remainder = number % 10;
 
            System.out.println(remainder);
 
            number = number / 10;
        }
    }
}