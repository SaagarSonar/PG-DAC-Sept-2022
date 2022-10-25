import java.util.*;
class a5{
public static void main(String [] args){
  Scanner sc= new Scanner(System.in);
  
 System.out.println("Enter No. of days");
 int  d=sc.nextInt();
 int years,months,days;
 
  years=d/365;
  months=(d%365)/30;
  days=(d%365)%30;  
 
   System.out.print(+years+","+months+","+days);
  //System.out.print(","+months);
  //System.out.print(","+days);
}
}