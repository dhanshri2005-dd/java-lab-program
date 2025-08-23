package ASSIGNMENTNO1;

	class MyDate {
	    int dd, mm, yy;

	    // Default constructor
	    MyDate() {
	        this.dd = 1;
	        this.mm = 1;
	        this.yy = 2000;
	    }

	    // Parameterized constructor
	    MyDate(int dd, int mm, int yy) {
	        this.dd = dd;
	        this.mm = mm;
	        this.yy = yy;
	    }

	    void displayDate() {
	        System.out.println(this.dd + "-" + this.mm + "-" + this.yy);
	    }
public class Q4{
	    public static void main(String[] args) {
	        MyDate date1 = new MyDate();           // Using default constructor
	        MyDate date2 = new MyDate(23, 8, 2025); // Using parameterized constructor

	        date1.displayDate(); // prints: 1-1-2000
	        date2.displayDate(); // prints: 23-8-2025
	    }
	}
	}
