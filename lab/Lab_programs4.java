package lab;
import java.util.*;
public class Lab_programs4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("program to read elements and print them on console%n");
		int arr[]=new int[7];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			System.out.println(arr[i]);
		}
		
            
        System.out.printf("%n%nprogram to take student's six subject's marks and print the subject marks, total, average.%n");
        int marks[]=new int[6];
        int sum=0;
        System.out.println("Enter the 6 subject marks: ");
        for(int i=0;i<marks.length;i++) {
        	arr[i]=sc.nextInt();
        	System.out.println("Marks are : "+arr[i]);
        	sum+=arr[i];
        }
        System.out.println("Sum of the subjects is : "+sum);
        System.out.println("Average of the subjects is : "+sum/6);
        
        
        System.out.println("%n%n program to search for an element among given elements%n");
        int a[]=new int[7];
        for(int i=0;i<a.length;i++) {
         a[i]= sc.nextInt();
        }
        System.out.println("Enter the value to be found : ");
        int n=sc.nextInt();
        int position=-1;
        for(int i=0;i<a.length;i++) {
            if(a[i]==n) {
            	position=i;
            	System.out.println("Element found at he index : "+position);
            	break;
            }
            else {
            	System.out.println("Element not found ");
            }
        }
        
        
        System.out.println("%n%nprogram to remove duplicate elements and print the unique elements%n");
        int array[]=new int[10];
        for(int i=0;i<array.length;i++) {
        	array[i]=sc.nextInt();
        	System.out.println("The array elements are:"+array[i]);
        }
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
        
        
        System.out.printf("%n%nprogram to display smallest and largest element the array of elements%n");
        System.out.println("Enter array elements:");
        int ar[]=new int[7];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int min = ar[0];
        int max = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < min) {
                min = ar[i];
            }
            if (arr[i] > max) {
                max = ar[i];
            }
        }
        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
sc.close();
	}

}
