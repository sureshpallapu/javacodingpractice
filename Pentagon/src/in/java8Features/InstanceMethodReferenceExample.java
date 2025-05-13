package in.java8Features;

class Messenger {
    public void sayHello() {
        System.out.println("Hello from instance method!");
    }
}

public class InstanceMethodReferenceExample {
    public static void main(String[] args) {
        Messenger msg = new Messenger();
        Runnable r = msg::sayHello;   // Method reference to instance method
        r.run();
    }
}
