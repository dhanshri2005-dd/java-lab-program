package ASSIGNMENTNO1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class Q7 {
	
	    int accno;
	    String accname;
	    double balance;

	    Q7(int accno, String accname, double balance) {
	        this.accno = accno;
	        this.accname = accname;
	        this.balance = balance;
	    }

	    void display() {
	        System.out.println("AccNo: " + accno + ", Name: " + accname + ", Balance: " + balance);
	    }

	    public static void sortAccount(Q7[] accounts) {
	        Arrays.sort(accounts, new Comparator<Q7>() {
	            public int compare(Q7 a1, Q7 a2) {
	                return Double.compare(a1.balance, a2.balance);
	            }
	        });
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of accounts: ");
	        int n = sc.nextInt();
	        sc.nextLine(); // consume newline

	        Q7[] accounts = new Q7[n];

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter account number: ");
	            int accno = sc.nextInt();
	            sc.nextLine();

	            System.out.print("Enter account holder name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter balance: ");
	            double balance = sc.nextDouble();
	            sc.nextLine();

	            accounts[i] = new Q7(accno, name, balance);
	        }

	        sortAccount(accounts);

	        System.out.println("\nAccounts sorted by balance:");
	        for (Q7 acc : accounts) {
	            acc.display();
	        }

	        sc.close();
	    }
	}

