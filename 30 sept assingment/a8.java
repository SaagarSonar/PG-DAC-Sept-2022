import java.util.*;
class a8{
public static void main(String args[]){
  Scanner sc= new Scanner(System.in);
  
 System.out.println("Enter employee's salary");
 double Basic=sc.nextDouble();
   double  HRA,DA,GS;
   
  if (Basic<10000)
   {
	 
	  HRA =(Basic*10)/100;
	  DA =(Basic*90)/100;
	  GS= Basic + DA + HRA;
	  System.out.println("gross salary="+GS+"RS."); 
	}
 else
    {
	 HRA =2000;
	 DA =(Basic*98)/100;
	 GS= Basic + DA + HRA; 
	 System.out.println("gross salary="+GS+"RS.");  
    }
	
   
}
}