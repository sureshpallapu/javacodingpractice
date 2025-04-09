package in.FinaleKeywordxamples;

public class FinalParameterExample {
    public void displayValue(final int value) {
//        value = 20; // Compile-time error: cannot assign a value to final parameter
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        FinalParameterExample example = new FinalParameterExample();
        example.displayValue(10);  // Output: Value: 10
    }
}
