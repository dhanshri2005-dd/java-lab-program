package Assignmentno3;


import java.util.*;

class NumberIsZeroException extends Exception {
    NumberIsZeroException(String msg) {
        super(msg);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num == 0) throw new NumberIsZeroException("Number is 0");

            boolean prime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            System.out.println(num + (prime ? " is Prime" : " is Not Prime"));

        } catch (NumberIsZeroException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}


