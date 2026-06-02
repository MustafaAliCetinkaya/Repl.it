/*Write a complete Java program in a class named StarFigures that generates the following output. 
Use static methods to show structure and eliminate redundancy in your solution.

*****
*****
 * *
  *
 * *

*****
*****
 * *
  *
 * *
*****
*****

  *
  *
  *
*****
*****
 * *
  *
 * *
*/

public class StarFigures {

    public static void main(String[] args) {
        printFigureOne();
        System.out.println();
        printFigureTwo();
        System.out.println();
        printFigureThree();
    }

    public static void printFigureOne() {
        printTopBar();
        printArrowhead();
    }

    public static void printFigureTwo() {
        printTopBar();
        printArrowhead();
        printTopBar();
    }

    public static void printFigureThree() {
        printStem();
        printTopBar();
        printArrowhead();
    }

    public static void printTopBar() {
        System.out.println("*****");
        System.out.println("*****");
    }

    public static void printArrowhead() {
        System.out.println(" * *");
        System.out.println("  *");
        System.out.println(" * *");
    }

    public static void printStem() {
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
    }
}
