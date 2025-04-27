package in.Interface.MultipleInheritance;

interface Engine {
    void start();
}

interface Wheels {
    void rotate();
}

class Car implements Engine, Wheels {
    public void start() {
        System.out.println("Engine started");
    }

    public void rotate() {
        System.out.println("Wheels are rotating");
    }
}

public class MultipleInterfacesExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.rotate();
    }
}
