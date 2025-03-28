package in.EnumExamples;

enum CoffeeSize {
    SMALL(100), MEDIUM(150), LARGE(200);

    private int price;

    CoffeeSize(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class CoffeeOrder {
    public static void main(String[] args) {
        CoffeeSize myCoffee = CoffeeSize.LARGE;
        System.out.println("Coffee Size: " + myCoffee + ", Price: $" + myCoffee.getPrice());
    }
}
