package Assignmentno3;
import java.util.*;

	class InvalidNameException extends Exception {
	    InvalidNameException(String msg) {
	        super(msg);
	    }
	}

	public class Q6 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        try {
	            System.out.print("Enter Doctor Name: ");
	            String name = sc.nextLine();

	            if (!name.matches("[A-Za-z ]+")) {
	                throw new InvalidNameException("Name is Invalid");
	            }

	            System.out.println("Valid Name: " + name);
	        } catch (InvalidNameException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}


