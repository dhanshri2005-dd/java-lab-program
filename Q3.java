package ASSIGNMENTNO1;
import java.util.Arrays;
public class Q3 {

	public static void main(String[] args) {
	        int[] arr = {5, 3, 8, 1, 4}; 
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }
	        Arrays.sort(arr);
	        System.out.println("Sum of elements: " + sum );
	        System.out.print("Array in ascending order: ");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}
	
	   

