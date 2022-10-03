import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //WRITE YOUR CODE BELOW:
    Scanner input=new Scanner (System.in);
    int n1, n2, n3;
    
    System.out.println("Enter first number:");
    n1=input.nextInt();

    System.out.println("Enter second number:");
    n2=input.nextInt();

    System.out.println("Enter third number:");
    n3=input.nextInt();

    input.close();

    if(n1<n2&&n2<n3||n3<n2&&n2<n1){
      System.out.println("middle number is: "+n2);
    }
    if(n3<n1&&n1<n2||n2<n1&&n1<n3){
      System.out.println("middle number is: "+n1);
    }
    if(n2<n3&&n3<n1||n1<n3&&n3<n2){
      System.out.println("middle number is: "+n3);
    }
    

    
  }
}