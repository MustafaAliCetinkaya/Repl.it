/* 
* Write a method called vertical that accepts a String as its parameter 
* and prints each letter of the string on separate lines.
*/

public static void vertical(String string) {

    for (int i = 0; i < string.length(); i++) {
        System.out.println(string.charAt(i));
    }
}
