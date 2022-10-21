import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //DO NOT TOUCH FOLLOWING LINE/LINES
    Scanner scan = new Scanner(System.in);
    String email = scan.next();
    
    //WRITE YOUR CODE BELOW
    int underScore=email.indexOf('_');
    int at=email.indexOf('@');
    int dot=email.indexOf('.');

     System.out.println("First name: "+email.substring(0,underScore).substring(0, 1).toUpperCase()+email.substring(1,underScore));
    System.out.println("Last name: "+email.substring(underScore+1,at).substring(0, 1).toUpperCase()+email.substring(underScore+2,at));
    System.out.println("Domain: "+email.substring(at+1,dot).substring(0, 1).toUpperCase()+email.substring(at+2,dot));



    
  }
}