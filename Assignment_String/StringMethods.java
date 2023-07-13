package Assignment_String;

public class StringMethods {

	public static void main(String[] args) {
        String str = "Bhojraj, Singh, Shekhawat";

        // Length of the string
        int length = str.length();
        System.out.println("Length: " + length);

        // Accessing characters in the string
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);

		// Substring
        String substring = str.substring(7);
        System.out.println("Substring: " + substring);

        // Concatenation
        String concatString = str.concat(" Welcome");
        System.out.println("Concatenated string: " + concatString);

        // Replacing characters
        String replacedString = str.replace('a', 'o');
        System.out.println("Replaced string: " + replacedString);

        // Converting case
        String uppercaseString = str.toUpperCase();
        String lowercaseString = str.toLowerCase();
        System.out.println("Uppercase string: " + uppercaseString);
        System.out.println("Lowercase string: " + lowercaseString);

       // Checking if a string starts or ends with a given prefix/suffix
        boolean startsWith = str.startsWith("Hello");
        boolean endsWith = str.endsWith("World!");
        System.out.println("Starts with 'Hello': " + startsWith);
        System.out.println("Ends with 'World!': " + endsWith);

        // Splitting a string into an array of substrings
        String[] splitArray = str.split(",");
        System.out.println("Split array: ");
        for (String s : splitArray) {
            System.out.println(s);
        }

        // Checking if a string contains a specific substring
        boolean contains = str.contains("World");
        System.out.println("Contains 'World': " + contains);
    }

}