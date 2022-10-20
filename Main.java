import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //DO NOT TOUCH FOLLOWING LINE/LINES
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    
    //WRITE YOUR CODE BELOW
    int howMany=0;
    String hi="hi";

for (int i=0; i<=str.length()-2; i++){
  String each=str.substring(i,i+2);
  if(each.equals(hi))
  howMany++;
}
System.out.println(howMany);
    
  }
}