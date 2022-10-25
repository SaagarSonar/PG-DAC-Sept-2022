import java.util.*;
class a6{
public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter temperature in Fahrenheit");
    int f=sc.nextInt();
    int C;
 
     C= 5*(f-32)/9;
   
  System.out.println("Enter temperature in Celsius="+C);
}
}