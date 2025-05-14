package in.abstraction;

abstract class moneyPayment {
    final String paymentType;  // Final variable

    moneyPayment(String paymentType) {
        this.paymentType = paymentType;
    }

    abstract void processPayment();

    void showPaymentType() {
        System.out.println("Payment Type: " + paymentType);
    }
}

class creditCard extends moneyPayment {
    creditCard() {
        super("Credit Card");
    }

    void processPayment() {
        System.out.println("Processing payment via Credit Card...");
    }
}

public class PaymentTest {
    public static void main(String[] args) {
    	moneyPayment payment = new creditCard();
        payment.showPaymentType();
        payment.processPayment();
    }
}

