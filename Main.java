import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner item=new Scanner(System.in);
    System.out.println("Hello, which item would you like?");
    
    String isAvailable=item.nextLine();
    
      
      switch(isAvailable){
        case "Blanket": System.out.println("Thank you for your purchase!");
          System.out.println("Your current balance is: "+(100-60)+"$");
          break;
          case "Charger": System.out.println("Thank you for your purchase!"); System.out.println("Your current balance is: "+(100-5)+"$");
          break;
            case "Hat": System.out.println("Thank you for your purchase!"); System.out.println("Your current balance is: "+(100-25)+"$");
          break;
            case "Headphones": System.out.println("Thank you for your purchase!"); System.out.println("Your current balance is: "+(100-30)+"$");
          break;
           case "Pants": System.out.println("Thank you for your purchase!"); System.out.println("Your current balance is: "+(100-50)+"$");
          break;
           case "Pillow": System.out.println("Thank you for your purchase!"); System.out.println("Your current balance is: "+(100-40)+"$");
          break;
           case "Socks": System.out.println("Thank you for your purchase!"); System.out.println("Your current balance is: "+(100-5)+"$");
          break;
        case "USB cable": System.out.println("Thank you for your purchase!"); System.out.println("Your current balance is: "+(100-10)+"$");
          break;
           case "Smartphone": System.out.println("Sorry, not enough funds on your gift card");
          break;
          case "Laptop": System.out.println("Sorry, not enough funds on your gift card");
          break;
          
                default: System.out.println("Sorry, that is an invalid item"); 
          break;
     }
      


          item.close();
    }
}



    
   
    
