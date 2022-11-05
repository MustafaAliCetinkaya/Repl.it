/*Write a complete Java program in a class named Egg2 that generates the following output. Use static methods to 
show structure and eliminate redundancy in your solution.

  _______
 /       \
/         \
\         /
 \_______/
-"-'-"-'-"-
  _______
 /       \
/         \
\         /
 \_______/
-"-'-"-'-"-
\         /
 \_______/
  _______
 /       \
/         \
-"-'-"-'-"-
\         /
 \_______/
*/

public class Egg2 {
    public static void main(String[] args) {
        broukenEgg();
        egg();
    }
    public static void broukenEgg() {
        String top = "  _______" + "\n" + " /       \\" + "\n" + "/         \\" + "\n";
        String center = "-\"-'-\"-'-\"-" + "\n";
        String bottom = "\\         /" + "\n" + " \\_______/";
        
        System.out.println(top + bottom + "\n" + center + top + bottom + "\n" + center + bottom);
        
}
    public static void egg() {
        String top = "  _______" + "\n" + " /       \\" + "\n" + "/         \\" + "\n";
        String center = "-\"-'-\"-'-\"-" + "\n";
        String bottom = "\\         /" + "\n" + " \\_______/" + "\n";
        System.out.println(top + center + bottom);
    }
}
