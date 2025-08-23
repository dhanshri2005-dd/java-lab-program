package ASSIGNMENTNO1;
import java.util.Scanner;


//-------- Renamed MyDate to MyCustomDate --------
class MyCustomDate {
 int dd, mm, yy;

 MyCustomDate() {
     this.dd = 1;
     this.mm = 1;
     this.yy = 2000;
 }

 MyCustomDate(int dd, int mm, int yy) {
     this.dd = dd;
     this.mm = mm;
     this.yy = yy;
 }

 void accept(Scanner sc) {
     System.out.print("Enter day: ");
     this.dd = sc.nextInt();
     System.out.print("Enter month: ");
     this.mm = sc.nextInt();
     System.out.print("Enter year: ");
     this.yy = sc.nextInt();
     sc.nextLine(); // consume newline
 }

 void display() {
     System.out.println(dd + "-" + mm + "-" + yy);
 }
}

//-------- Q8 class (main class for Person) --------
public class Q8 {
 private int id;
 private String name;
 private MyCustomDate dob;
 private static int cnt = 1;

 Q8() {
     this.id = cnt++;
     this.name = "";
     this.dob = new MyCustomDate();
 }

 Q8(String name, MyCustomDate dob) {
     this.id = cnt++;
     this.name = name;
     this.dob = dob;
 }

 void accept(Scanner sc) {
     System.out.print("Enter name: ");
     this.name = sc.nextLine();
     System.out.println("Enter Date of Birth:");
     this.dob = new MyCustomDate();
     this.dob.accept(sc);
 }

 void display() {
     System.out.print("ID: " + id + ", Name: " + name + ", DOB: ");
     dob.display();
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("How many persons? ");
     int n = sc.nextInt();
     sc.nextLine();  // consume newline

     Q8[] persons = new Q8[n];

     for (int i = 0; i < n; i++) {
         System.out.println("\nEnter details for person " + (i + 1) + ":");
         persons[i] = new Q8();
         persons[i].accept(sc);
     }

     System.out.println("\nPerson Details:");
     for (Q8 p : persons) {
         p.display();
     }

     sc.close();
 }
}



