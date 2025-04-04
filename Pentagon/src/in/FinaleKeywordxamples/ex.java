 package in.FinaleKeywordxamples;

class Animal {
    final void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Error: Cannot override the final method from Animal
    // void sound() {
    //     System.out.println("Dog barks");
    // }
}
