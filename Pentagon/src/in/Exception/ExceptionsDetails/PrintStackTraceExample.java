package in.Exception.ExceptionsDetails;

public class PrintStackTraceExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // ArithmeticException: Division by zero
        } catch (ArithmeticException e) {
            e.printStackTrace();  // Prints the full stack trace
        }
    }
}
//printStackTrace() prints the error type, message, and where the error happened (line 5).

