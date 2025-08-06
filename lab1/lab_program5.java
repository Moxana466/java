package lab1;
import java.util.*;
public class lab_program5 {
	public static void main(String[] args) {
        System.out.println("A program to take an input of a string print it on the console");
		String name = "Mohana";
        System.out.println(name);
        
        
		
        
        System.out.printf("%n%nAprogram to display a string value through an object%n");
        int number=7;
        String num=new String(String.valueOf(number));
        System.out.println(num);
        
        
        
        System.out.printf("%n%nprogram that includes the usage of all strig methods%n");
        String str1 = "  Hello, Java World!  ";
        String str2 = "java";
        String str3 = "HELLO";
        String str4 = "Java123";
        // 1. Length of the string
        System.out.println("Length: " + str1.length());
        // 2. charAt()
        System.out.println("Character at index 1: " + str1.charAt(1));
        // 3. substring()
        System.out.println("Substring (7 to 11): " + str1.substring(7, 11));
        // 4. contains()
        System.out.println("Contains 'Java': " + str1.contains("Java"));
        // 5. equals() and equalsIgnoreCase()
        System.out.println("Equals 'java': " + str2.equals("java"));
        System.out.println("EqualsIgnoreCase 'JAVA': " + str2.equalsIgnoreCase("JAVA"));
        // 6. compareTo() and compareToIgnoreCase()
        System.out.println("Compare 'java' to 'java': " + str2.compareTo("java"));
        System.out.println("CompareIgnoreCase 'java' to 'JAVA': " + str2.compareToIgnoreCase("JAVA"));
        // 7. indexOf() and lastIndexOf()
        System.out.println("Index of 'Java': " + str1.indexOf("Java"));
        System.out.println("Last index of 'a': " + str1.lastIndexOf('a'));
        // 8. toUpperCase() and toLowerCase()
        System.out.println("Upper case: " + str2.toUpperCase());
        System.out.println("Lower case: " + str3.toLowerCase());
        // 9. startsWith() and endsWith()
        System.out.println("Starts with '  Hello': " + str1.startsWith("  Hello"));
        System.out.println("Ends with 'World!  ': " + str1.endsWith("World!  "));
        // 10. trim()
        System.out.println("Trimmed string: '" + str1.trim() + "'");
        System.out.println("Replace 'Java' with 'Python': " + str1.replace("Java", "Python"));
        String emptyStr = "";
        String blankStr = "   ";
        System.out.println("Is empty: " + emptyStr.isEmpty());
        System.out.println("Is blank: " + blankStr.isBlank());
        String[] words = str1.trim().split(" ");
        System.out.print("Split words: ");
        for (String word : words) {
            System.out.print(word + " | ");
        }
        System.out.println();
        System.out.println("str4 matches alphanumeric: " + str4.matches("[a-zA-Z0-9]+"));
        char[] chars = str2.toCharArray();
        System.out.print("Characters: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}


