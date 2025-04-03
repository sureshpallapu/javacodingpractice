package in.EnumExamples;

interface Displayable {
    void display();
}

enum Status implements Displayable {
    ACTIVE, INACTIVE, PENDING;

    @Override
    public void display() {
        System.out.println("Current Status: " + this);
    }
}

public class EnumWithInterface {
    public static void main(String[] args) {
        Status s = Status.ACTIVE;
        s.display();
    }
}
