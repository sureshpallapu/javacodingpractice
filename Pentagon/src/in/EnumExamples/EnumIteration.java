package in.EnumExamples;

enum Color {
    RED, GREEN, BLUE;
}

public class EnumIteration {
    public static void main(String[] args) {
        for (Color c : Color.values()) {
            System.out.println(c);
        }
    }
}
