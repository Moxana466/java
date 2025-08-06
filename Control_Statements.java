package Java;

import java.util.Scanner;

public class Control_Statements {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 System.out.printf("%nCheck if a number is even or odd.%n");
	    System.out.println("Enter the value of c:");
	    int c=sc.nextInt();
	    if(c%2==0) {
	    	System.out.println(c+" is even");
	    }
	    else {
	    	System.out.println(c+" is odd");
	    }
	    
	    
	    System.out.printf("%n%nto check if a given number is positive%n");
	    System.out.println("Enter the value of d: ");
	    int d=sc.nextInt();
	    if(d>0) {
	    	System.out.println(d+" is a positive number");
	    }
	    else if(d<0){
	    	System.out.println(d+" is a negitive number");
	    }
	    else {
	    	System.out.println(d+" is equal to zero");
	    }
	    
	    
	    
	    System.out.printf("%n%nGrade a student based on marks%n");
	     int science_marks=sc.nextInt();
	     int maths_marks=sc.nextInt();
	     int physics_marks=sc.nextInt();
	     int chem_marks=sc.nextInt();
	     int eng_marks=sc.nextInt();
	     int sum= (science_marks+maths_marks+physics_marks+chem_marks+eng_marks);
	    		if(sum/5<=100 && sum/5>=91) {
	    			System.out.println("Grade is A+");
	    		}
	    		else if(sum/5>=90 && sum/5<=81) {
	    			System.out.println("Grade is A");
	    		}
	    		else if(sum/5>=80 && sum/5<=71) {
	    			System.out.println("Grade is B");
	    		}
	    		else if(sum/5>=70 && sum/5<=61) {
	    			System.out.println("Grade is c");
	    		}
	    		else if(sum/5>=60 && sum/5<=51) {
	    			System.out.println("Grade is D");
	    		}
	    		else if(sum/5>=50 && sum/5<=41) {
	    			System.out.println("Grade is E");
	    		}
	    		else{
	    			System.out.println("Grade is F(FAIL)");
	    		}
	    		
	    		
	    		
	   System.out.printf("%n%nDisplay day name based on number (1–7).%n");
	   int number=sc.nextInt();
	   String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	   for(int i=1;i<=7;i++) {
	   if(number==i) {
	    	System.out.println("Today is "+days[i-1]);
	   }
	}
	   
	

	    System.out.printf("%n%nPrint numbers from 1 to N.%n");
	    System.out.println("Enter the number of elements: ");
	    int x = sc.nextInt();  
	    System.out.println("Enter " + x + " numbers:"); 
	    for (int i = 1; i <= x; i++) {        
	        System.out.println(i);  
	    }
	    
	    
	    
	    System.out.printf("%n%nAccept numbers until user enters 0.%n");
	     System.out.println("Enter the value of e: ");
	     while(true) {
	    	 int e=sc.nextInt();
	    	 System.out.println("Number = "+e);
	    	 if(e==0) {
	    		 break;
	    	 }
	     }
	     
	     
	     System.out.printf("%nPrint the multiplication table for a given number.%n");
		    int n=sc.nextInt();
		    for(int i=1;i<=10;i++) {
		    	System.out.print(n+" x"+" "+i+" ="+" "+n*i+System.lineSeparator());
		    }
		    sc.close();
}
}
