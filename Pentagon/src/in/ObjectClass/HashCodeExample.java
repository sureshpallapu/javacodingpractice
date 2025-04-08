package in.ObjectClass;

import java.util.Objects;

class Product {
    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
public class HashCodeExample{
    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop");
        Product p2 = new Product(1, "Laptop");
        System.out.println(p1.hashCode() == p2.hashCode()); // Output: true
    }
}

