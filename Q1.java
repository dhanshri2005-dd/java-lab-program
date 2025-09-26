package Assignmentno3;
import java.util.*;

	public class Q1 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Set<Integer> set = new TreeSet<>(); // No duplicates, sorted

	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            set.add(sc.nextInt());
	        }

	        System.out.println("Sorted Unique Elements: " + set);

	        System.out.print("Enter element to search: ");
	        int key = sc.nextInt();

	        if (set.contains(key)) {
	            System.out.println(key + " found in collection.");
	        } else {
	            System.out.println(key + " not found.");
	        }
	    }
	}


