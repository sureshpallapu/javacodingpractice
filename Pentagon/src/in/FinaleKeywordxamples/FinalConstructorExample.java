  package in.FinaleKeywordxamples;

public class FinalConstructorExample {
    private final int x;

    public FinalConstructorExample(final int x) {
        this.x = x;  // Initialize the final instance variable
    }

    public static void main(String[] args) {
        FinalConstructorExample example = new FinalConstructorExample(100);
        System.out.println(example.x);  // Output: 100
    }
}
