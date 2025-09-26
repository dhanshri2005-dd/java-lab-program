package Assignmentno3;


	import java.util.*;

	class InvalidDateException extends Exception {
	    InvalidDateException(String msg) {
	        super(msg);
	    }
	}

	public class Q9 {
	    int day, month, year;

	    void accept(int d, int m, int y) throws InvalidDateException {
	        if (m < 1 || m > 12 || d < 1 || d > 31)
	            throw new InvalidDateException("Invalid day or month

	    }
	}
	
	
