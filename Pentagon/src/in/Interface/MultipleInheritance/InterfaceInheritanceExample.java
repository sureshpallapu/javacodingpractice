package in.Interface.MultipleInheritance;

interface Animal {
    void eat();
}

interface Dog extends Animal {  // Dog inherits from Animal
    void bark();
}

class Labrador implements Dog {
    public void eat() {
        System.out.println("Labrador is eating");
    }

    public void bark() {
        System.out.println("Labrador is barking");
    }
}

public class InterfaceInheritanceExample {
    public static void main(String[] args) {
        Labrador lab = new Labrador();
        lab.eat();
        lab.bark();
    }
}
