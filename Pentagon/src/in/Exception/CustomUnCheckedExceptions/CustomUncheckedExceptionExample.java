package in.Exception.CustomUnCheckedExceptions;

public class CustomUncheckedExceptionExample {
    // Method to check for negative numbers
    static void checkNumber(int number) {
        if (number < 0) {
            throw new NegativeNumberException("Number cannot be negative.");
        } else {
            System.out.println("Valid number: " + number);
        }
    }

    public static void main(String[] args) {
        try {
        	checkNumber(-5);  // Throws NegativeNumberException
        }catch(NegativeNumberException e) {
        	System.out.println(e.getMessage());
        }
    }
}
