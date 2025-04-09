package in.FinaleKeywordxamples;

public class FinalVariableExample {
    final int x = 10;

    public void changeValue() {
//         x = 20; // Compile-time error: cannot assign a value to final variable x
    }

    public static void main(String[] args) {
        FinalVariableExample example = new FinalVariableExample();
        System.out.println(example.x);  // Output: 10
    }
}
