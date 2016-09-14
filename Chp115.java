 //1.1.5
import java.util.Scanner;

 public class Chp115{

 public static void main(String[] args) {   
    
    Scanner console = new Scanner(System.in);
    
    double x, y;
    String TRUE = "TRUE";
    String FALSE = "FALSE";
    
    System.out.print("Enter number between 0 and 1: ");
    x = console.nextDouble();
    System.out.print("Enter number between 0 and 1: ");
    y = console.nextDouble();
    
    if ( x > 0 && x < 1 && y > 0 && y < 1)
    System.out.println(TRUE);
    else
    System.out.println(FALSE);
    
   }    
  }
