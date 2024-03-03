import java.util.Scanner;

public class stringbuilder_compress {
    public static String stringbuilder(String str){
    StringBuilder sb = new StringBuilder("");

    for (int i = 0 ; i < str.length() ; i++){
        int count = 1 ;
    while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
        i++;
        count++;
    }
    sb.append(str.charAt(i));
    if (count > 1) {
        sb.append(count);
    }
    }
    return sb.toString();
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    String str = "aaabbbcccddd";
    System.out.println("Compressed string: " + stringbuilder(str));
    sc.close();
    }
}
// Sure, let's break down the code line by line:

// 1. `import java.util.Scanner;`: This line imports the `Scanner` class from the `java.util` package, which allows us to read input from the user.

// 2. `public class StringBuilderCompression {`: This line defines a class named `StringBuilderCompression`. The keyword `public` indicates that the class can be accessed from other classes. 

// 3. `public static String compressString(String str) {`: This line declares a method named `compressString`. The method takes a string `str` as input and returns a compressed version of that string.

// 4. `StringBuilder sb = new StringBuilder();`: This line creates a new `StringBuilder` object named `sb`. `StringBuilder` is a class provided by Java for manipulating strings more efficiently.

// 5. `for (int i = 0; i < str.length(); i++) {`: This line starts a `for` loop that iterates over each character in the input string `str`. It initializes an integer variable `i` to 0, then loops until `i` reaches the length of the input string.

// 6. `int count = 1;`: This line initializes an integer variable `count` to 1. This variable will be used to count the number of consecutive repeating characters.

// 7. `while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {`: This line starts a `while` loop that checks if the current character is the same as the next character in the input string, and if we haven't reached the end of the string. If both conditions are true, it means we have consecutive repeating characters.

// 8. `i++;`: This line increments the value of `i`, moving to the next character in the string.

// 9. `count++;`: This line increments the value of `count`, indicating that we've encountered another repeating character.

// 10. `sb.append(str.charAt(i));`: This line appends the current character (the non-repeating character) to the `StringBuilder` object `sb`.

// 11. `if (count > 1) { sb.append(count); }`: This line checks if the count of repeating characters is greater than 1. If it is, it appends the count to the `StringBuilder` object `sb`.

// 12. `return sb.toString();`: This line returns the compressed string stored in the `StringBuilder` object `sb` as a regular string.

// 13. `public static void main(String[] args) {`: This line declares the main method, which is the entry point of the program.

// 14. `Scanner sc = new Scanner(System.in);`: This line creates a new `Scanner` object named `sc`, which will be used to read input from the user.

// 15. `System.out.println("Enter a string:");`: This line prints a message asking the user to enter a string.

// 16. `String str = sc.nextLine();`: This line reads a line of text input by the user and stores it in the variable `str`.

// 17. `System.out.println("Compressed string: " + compressString(str));`: This line prints the compressed version of the input string by calling the `compressString` method with the user input as an argument.

// 18. `sc.close();`: This line closes the `Scanner` object to release system resources.