

import java.util.Arrays;

public class ParseStringToAscii {

    public static void main(String[] args) {

        // Approach 1: Using a loop to iterate through each character of the string and convert it to its ASCII value.
        // This program demonstrates how to parse a string and convert each character to its ASCII value.
        // It uses a simple loop to iterate through each character of the string and prints its ASCII value.
        // The ASCII value is obtained by casting the character to an integer.
        // Example string to parse
        String str = "Hello, World!";
        
        // Parse the string to ASCII values
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the character at index i
            int asciiValue = (int) ch; // Convert the character to its ASCII value
            System.out.println("Character: " + ch + ", ASCII Value: " + asciiValue); // Print the character and its ASCII value
        }

        // Approach 2: Using Java's built-in method to get the ASCII value of a character.
        // This program demonstrates how to parse a string and convert each character to its ASCII value using Java's built-in method.
        // It uses the String class's getBytes() method to obtain the ASCII values of the characters in the string.
        // Example string to parse
        String str2 = "Hello, World!";

        int[] asciiValues = new int[str2.length()]; // Create an array to store the ASCII values
        byte[] bytes = str2.getBytes(); // Get the bytes of the string

        for (int i = 0; i < bytes.length; i++) {
            asciiValues[i] = bytes[i]; // Store the ASCII value in the array
        }
        System.out.println("ASCII values using getBytes(): " + Arrays.toString(asciiValues));
        

        String str3 = "Aditya";
        int asci = (int)str3.charAt(0); // Get the ASCII value of the first character of the string;
        System.out.println(asci);
    }
    
}
