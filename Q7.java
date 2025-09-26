package Assignmentno3;
import java.io.*;
	import java.util.Scanner;

	public class Q7 {
	    public static void main(String[] args) throws IOException {
	        Scanner sc = new Scanner(System.in);
	        DataOutputStream dos = new DataOutputStream(new FileOutputStream("customers.dat"));

	        System.out.print("Enter number of customers: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter ID: ");
	            int id = sc.nextInt(); sc.nextLine();
	            System.out.print("Enter Name: ");
	            String name = sc.nextLine();
	            System.out.print("Enter Address: ");
	            String addr = sc.nextLine();
	            System.out.print("Enter Mobile No: ");
	            String mob = sc.nextLine();

	            dos.writeInt(id);
	            dos.writeUTF(name);
	            dos.writeUTF(addr);
	            dos.writeUTF(mob);
	        }

	        dos.close();

	        System.out.println("\nReading from file...");
	        DataInputStream dis = new DataInputStream(new FileInputStream("customers.dat"));

	        while (dis.available() > 0) {
	            int id = dis.readInt();
	            String name = dis.readUTF();
	            String addr = dis.readUTF();
	            String mob = dis.readUTF();

	            System.out.println("ID: " + id + ", Name: " + name + ", Address: " + addr + ", Mobile: " + mob);
	        }

	        dis.close();
	    }
	}


