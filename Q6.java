package ASSIGNMENTNO1;
import java.util.Scanner;
public class Q6 {

	    String name;
	    double salary;

	    Q6(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    void display() {
	        System.out.println("Name: " + name + ", Salary: " + salary);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Q6[] employees = new Q6[5];

	        for (int i = 0; i < 5; i++) {
	            System.out.print("Enter name for employee " + (i + 1) + ": ");
	            String name = sc.nextLine();

	            System.out.print("Enter salary for employee " + (i + 1) + ": ");
	            double salary = sc.nextDouble();
	            sc.nextLine(); // consume leftover newline

	            employees[i] = new Q6(name, salary);
	        }

	        System.out.println("\nEmployee Details:");
	        for (Q6 emp : employees) {
	            emp.display();
	        }

	        sc.close();
	    }
	}

