package in.EnumExamples;

enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRALARGE("XL");

    private String abbreviation;

    Size(String abbreviation) { // Constructor
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}

public class EnumWithMethods {
    public static void main(String[] args) {
        Size mySize = Size.LARGE;
        System.out.println("Size: " + mySize + ", Abbreviation: " + mySize.getAbbreviation());
    }
}
