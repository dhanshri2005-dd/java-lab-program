package ASSIGNMENTNO1;

public class Q5 {
	    private int num;

	    Q5() {
	        this.num = 0;
	    }

	    Q5(int num) {
	        this.num = num;
	    }

	    boolean isNegative() {
	        return num < 0;
	    }

	    boolean isPositive() {
	        return num > 0;
	    }

	    boolean isOdd() {
	        return num % 2 != 0;
	    }

	    boolean isEven() {
	        return num % 2 == 0;
	    }

	    public static void main(String[] args) {
	        if (args.length == 0) {
	            System.out.println("Please provide an integer as command line argument.");
	            return;
	        }

	        int value = Integer.parseInt(args[0]);
	        Q5 myNum = new Q5(value);

	        System.out.println("Number: " + value);
	        System.out.println("Is Negative? " + myNum.isNegative());
	        System.out.println("Is Positive? " + myNum.isPositive());
	        System.out.println("Is Odd? " + myNum.isOdd());
	        System.out.println("Is Even? " + myNum.isEven());
	    }
	}

	    


