package in.EnumExamples;

enum Shape {
    CIRCLE {
        @Override
        public double area(double value) {
            return Math.PI * value * value;
        }
    },
    SQUARE {
        @Override
        public double area(double value) {
            return value * value;
        }
    };

    public abstract double area(double value);
}

public class EnumAbstractMethod {
    public static void main(String[] args) {
        System.out.println("Circle Area: " + Shape.CIRCLE.area(5));
        System.out.println("Square Area: " + Shape.SQUARE.area(4));
    }
}
