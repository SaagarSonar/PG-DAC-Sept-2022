import java.util.*;
class a4{
public static void main(String [] args){
  Scanner sc= new Scanner(System.in);
  
 System.out.println("Enter principal amount");
 double  P=sc.nextDouble();
 System.out.println("Enter rate of interest");
 double R=sc.nextDouble();
 System.out.println("Enter time period");
 double N=sc.nextDouble();
 

 double simpleinterest;
 
 simpleinterest=(P*N*R)/100;
 
   System.out.println("simple interest="+simpleinterest+"Rs");
  
}
}