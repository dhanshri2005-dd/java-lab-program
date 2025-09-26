package Assignmentno3;
import java.io.*;
	import java.util.*;

	public class Q8 {
	    public static void main(String[] args) throws IOException {
	        Set<Integer> numbers = new HashSet<>();
	        Scanner sc = new Scanner(System.in);
	        Random rand = new Random();
	        int choice;

	        do {
	            System.out.println("\n1. Load\n2. Save\n3. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    numbers.clear();
	                    while (numbers.size() < 10) {
	                        numbers.add(10 + rand.nextInt(90)); // 2-digit
	                    }
	                    System.out.println("Generated Numbers: " + numbers);
	                    break;

	                case 2:
	                    BufferedWriter bw = new BufferedWriter(new FileWriter("number.txt"));
	                    for (int num : numbers) {
	                        bw.write(num + "\n");
	                    }
	                    bw.close();
	                    System.out.println("Numbers saved to file.");
	                    break;
	            }
	        } while (choice != 3);
	    }
	}


