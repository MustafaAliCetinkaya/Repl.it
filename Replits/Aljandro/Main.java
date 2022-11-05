import java.util.*;
class Main {
  public static void main(String[] args) {
    //DO NOT TOUCH FOLLOWING LINE/LINES
    Scanner s = new Scanner(System.in);
    String email = s.nextLine();
    
    //WRITE YOUR CODE BELOW  
    boolean existAlejandro=email.toLowerCase().contains("alejandro");
    
    boolean existProject=email.toLowerCase().contains("project");

    if (existAlejandro&&existProject){
      System.out.println("priority");
    }else if(!existProject&&existAlejandro){
       System.out.println("read");
    }else if(!existAlejandro){
      System.out.println("don't read");
    }  
   
  }
}
    