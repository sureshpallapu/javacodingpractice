package in.Encapsulation;

enum Status {
    ACTIVE, INACTIVE, PENDING;
}

public class EnumTest {
    public static void main(String[] args) {
        Status status = Status.ACTIVE;
        System.out.println("Status: " + status);
    }
}
