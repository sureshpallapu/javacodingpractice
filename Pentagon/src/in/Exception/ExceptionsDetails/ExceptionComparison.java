package in.Exception.ExceptionsDetails;

public class ExceptionComparison {
    public static void main(String[] args) {
        try {
            int[] arr = new int[2];
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("getMessage(): " + e.getMessage()); // Shows message
            e.printStackTrace();  // Shows full error details
        }
    }
}
