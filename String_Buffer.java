package StringBuffer_Builder;
import java.util.*;
public class String_Buffer {
    public static void main(String[] args) {
    	//Java program where two String variables refer to the same literal. 
    	//Change one variable’s value. Print both variables and explain the output
    	System.out.printf("Java program where two String variables refer to the same literal.Change one variable’s value. Print both variables and explain the output%n");
    	StringBuffer sb=new StringBuffer("Hello World");
    	StringBuffer sb1=new StringBuffer("Hello World");
        System.out.println("to insert 'java' to sb1 : "+sb1.insert(6,"Java "));
        System.out.println("sb : "+sb);
        System.out.println("sb : "+sb);
        System.out.println("is sb=sb1 : "+(sb==sb1));
        
        
        //Java program to show the difference between == and equals() for String objects in Java.
        System.out.printf("%n%nJava program to show the difference between == and equals() for String objects in Java.%n");
        StringBuffer s = new StringBuffer("Hello");
        StringBuffer s1 = new StringBuffer("Hello");
        StringBuffer s2 = s;
        System.out.println("s == s1 : " + (s == s1));       
        System.out.println("s.equals(s1) : " + s.equals(s1)); 
        
        //Java program using a StringBuffer class with "Hello" and append " World" to it. 
        //Print before and after appending.
        System.out.printf("%n%nJava program using a StringBuffer class with 'Hello' and append ' World' to it.Print before and after append%n");
        StringBuffer s3 = new StringBuffer("Hello");
        System.out.println("Before modifying : "+sb);
        s3.append(" World");
        System.out.println("After modifying : "+sb);
        
        
        //5. Java program to take student full name and reverse only the last name using StringBuffer.
        System.out.println("Java program to take student full name and reverse only the last name using StringBuffer.");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name : ");
        String name=sc.nextLine();
        StringBuffer Student_name = new StringBuffer(name);
        
    }  	
}
