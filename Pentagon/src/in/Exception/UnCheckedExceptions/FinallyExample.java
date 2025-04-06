package in.Exception.UnCheckedExceptions;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int num = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("This block always executes!");
        }
    }
}
