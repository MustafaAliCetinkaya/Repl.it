public class Main {
  public static void main(String[] args) {
    //DO NOT TOUCH THESE LINE/LINES.
    String cityOne = "Chicago";
    String cityTwo = "Virginia";
    double basePrice = 152.40;
    double milesBetweenCities = 739.8;
    double rate = 3;
    
    //WRITE YOUR CODE BELOW:
    double price=basePrice+milesBetweenCities/rate;
    System.out.println("The ticket price from Chicago to Virginia is "+"$"+price);

  }
}