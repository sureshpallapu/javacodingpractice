package in.EnumExamples;

enum TrafficLight {
    RED, GREEN, YELLOW;
}

public class EnumSwitchExample {
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.RED;

        switch (light) {
            case RED:
                System.out.println("Stop!");
                break;
            case GREEN:
                System.out.println("Go!");
                break;
            case YELLOW:
                System.out.println("Slow down!");
                break;
        }
    }
}
