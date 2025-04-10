package in.abstraction;

interface Playable {
    void play();
}

abstract class Instrument implements Playable {
    void tune() {
        System.out.println("Tuning the instrument...");
    }
}

class Guitar extends Instrument {
    public void play() {
        System.out.println("Playing the Guitar...");
    }
}

public class InterfaceWithAbstract {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        g.tune();
        g.play();
    }
}

