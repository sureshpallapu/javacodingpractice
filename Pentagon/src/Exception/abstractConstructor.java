package Exception;

abstract class Parent {
    Parent() {
        System.out.println("Abstract class constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child class constructor");
    }
}

public class abstractConstructor {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
