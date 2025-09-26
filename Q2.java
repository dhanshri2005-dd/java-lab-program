package Assignmentno3;
import java.util.*;

public class Q2 {
	    public static void main(String[] args) {
	        Hashtable<String, Double> empTable = new Hashtable<>();
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of Employees: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter Name: ");
	            String name = sc.nextLine();
	            System.out.print("Enter Salary: ");
	            double sal = sc.nextDouble();
	            sc.nextLine();
	            empTable.put(name, sal);
	        }

	        System.out.println("Employee Details:");
	        for (Map.Entry<String, Double> e : empTable.entrySet()) {
	            System.out.println("Name: " + e.getKey() + ", Salary: " + e.getValue());
	        }

	        System.out.print("Enter name to search: ");
	        String search = sc.nextLine();

	        if (empTable.containsKey(search)) {
	            System.out.println("Salary of " + search + ": " + empTable.get(search));
	        } else {
	            System.out.println("Employee not found.");
	        }
	    }
	}


