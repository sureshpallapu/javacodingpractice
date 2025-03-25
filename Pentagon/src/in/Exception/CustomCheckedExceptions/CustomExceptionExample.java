package in.Exception.CustomCheckedExceptions;

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom exception!");
        } catch (CustomException e) {
            e.printStackTrace();  // Print full stack trace
        }
    }
}

