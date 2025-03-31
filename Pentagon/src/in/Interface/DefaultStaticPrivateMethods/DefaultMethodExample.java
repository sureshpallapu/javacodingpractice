package in.Interface.DefaultStaticPrivateMethods;

interface Payment {
    void pay(double amount);  // Abstract method

    default void showPaymentMethod() {  // Default method with implementation
        System.out.println("Payment method: Online");
    }
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.pay(100.0);
        payment.showPaymentMethod();  // Calls the default method
    }
}


       