/*What is the output produced from the following program? You may wish to draw a structure diagram first.


public class Tricky {
    public static void main(String[] args) {
        message1();
        message2();
        System.out.println("Done with main.");
    }
​
    public static void message1() {
        System.out.println("This is message1.");
    }
​
    public static void message2() {
        System.out.println("This is message2.");
        message1();
        System.out.println("Done with message2.");
    }
}*/
This is message1.
This is message2.
This is message1.
Done with message2.
Done with main.
