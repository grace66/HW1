//For page 54, question #1.1.3
public class Chp113 {
public static void main(String[] args) 
  {
  Scanner console = new Scanner (System.in);
   int n1, n2, n3;   // declair variables
   String equal = "Equal";
   String notequal = "Not Equal";  
   
   System.out.println("Enter the first number: ");
   n1 = console.nextInt();
   System.out.println("Enter the second number: ");
   n2 = console.nextInt();
   System.out.println("Enter the third number: ");
   n3 = console.nextInt ();
   
     if ( n1 == n2 && n2 == n3){
      
     //number = Integer.toString(n);
     System.out.println(equal);
     }
     else {
     
     System.out.println(notequal);
     }
}
}                   				 
		//System.exit(0);	
