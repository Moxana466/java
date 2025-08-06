package Java;

import java.util.Scanner;

public class operators {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("addition, subtraction, multiplication, division, and modulus of two numbers.%n");
		System.out.println("Enter the values of a and b: ");
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
	    System.out.println("Product of "+a+" and "+b+" is "+(a*b));
	    System.out.println("Difference of "+a+" and "+b+" is "+(a-b));
	    System.out.println("Quotient of "+a+" and "+b+" is "+(a/b));
	    System.out.println("Modulus of "+a+" and "+b+" is "+(a%b));
	    
	    
	    System.out.printf("%n%ntwo integers and display which one is greater or if they are equal.%n");
	    if(a>b && a!=b) {
	    	System.out.println(a+" is greater than "+b);
	    }
	    else if(b>a && b!=a){
	    	System.out.println(a+" is greater than "+b);
	    }
	    else {
	    	System.out.println(a+" is equal to "+b);
	    }
	    		
	    		
	    		System.out.printf("%n%n Demonstrate bitwise AND, OR, XOR, and complement operators on two numbers%n");
	    		System.out.println(a+" AND "+b+" = "+(a & b));
	    		System.out.println(a+" OR "+b+" = "+(a | b));
	    		System.out.println(a+" XOR "+b+" = "+(a ^ b));
	    		System.out.println(a+" NOT "+" = "+(~a));
	    		System.out.println(b+" NOT "+" = "+(~ b));
	    		
	    		
	    		
	    		
	    		System.out.printf("%n%nif a student passed both theory and practical exams using logical AND.%n");
	    		System.out.print("Enter theory marks: ");
	            int theory = sc.nextInt();

	            System.out.print("Enter practical marks: ");
	            int practical = sc.nextInt();
	            int passMark = 40;
	            if (theory >= passMark && practical >= passMark) {
	                System.out.println("Student passed both theory and practical exams.");
	            } else {
	                System.out.println("Student failed in one or both exams.");
	            } 
	            
	            
	            System.out.printf("%n%nDemonstrate compound assignment operators on a number.%n");
	            int num=a;
	            System.out.println("\nInitial number: " + num);
	            num += 5;
	            System.out.println("After num += 5: " + num);
	            num -= 2;
	            System.out.println("After num -= 2: " + num);
	            num *= 3;
	            System.out.println("After num *= 3: " + num);
	            num /= 4;
	            System.out.println("After num /= 4: " + num);
	            num %= 6;
	            System.out.println("After num %= 6: " + num);
	            
	            
	            
	            System.out.printf("%n%n Demonstrate increment and decrement operators on a variable.%n");
	            System.out.println("Initial value of a: " + a);
	            System.out.println("Post-increment (a++): " + (a++));
	            System.out.println("After post-increment, a: " + a);
	            System.out.println("Pre-increment (++a): " + (++a));
	            System.out.println("Post-decrement (a--): " + (a--));
	            System.out.println("After post-decrement, a: " + a);
	            System.out.println("Pre-decrement (--a): " + (--a)); 
	            
	            
	            
	            System.out.printf("%n%nDemonstrate left shift and right shift operations on an integer.%n");
	            System.out.print("Enter number of positions to shift: ");
	            int shift = sc.nextInt();
	            int leftShift = num << shift;
	            int rightShift = num >> shift;
	            System.out.println("\nOriginal number: " + num);
	            System.out.println("After left shift (num << " + shift + "): " + leftShift);
	            System.out.println("After right shift (num >> " + shift + "): " + rightShift);
		}
}
