import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

        int count=1;
        double totalCostOfTrip=0;
        String result="";

        System.out.println("Enter the name of item "+count);
        String item = scan.nextLine();
        System.out.println("Enter the price of the "+item);
        double price = scan.nextDouble();
        System.out.println("How many "+item+" will you buy?");
        int number = scan.nextInt();
        scan.nextLine();
        result += item+" x "+number+" - $"+ number*price+"\n";
        totalCostOfTrip += price*number;
        System.out.println("Do you want to add more items to the shopping list?");
        String answer = scan.nextLine();
        while (!(answer.equals("no"))){
            count++;
            System.out.println("Enter the name of item "+count);
            item = scan.nextLine();
            System.out.println("Enter the price of the "+item);
            price = scan.nextDouble();
            System.out.println("How many "+item+" will you buy?");
            number = scan.nextInt();
            scan.nextLine();
            result += item+" x "+number+" - $"+ number*price+"\n";
            totalCostOfTrip += price*number;
            System.out.println("Do you want to add more items to the shopping list?");
            answer = scan.nextLine();
        }
                System.out.println("SHOPPING LIST:");
                System.out.println(result.trim());
                System.out.println("Total cost: $"+totalCostOfTrip);
            

        scan.close();

    }


		
  }
