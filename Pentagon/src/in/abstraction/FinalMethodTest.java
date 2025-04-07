package in.abstraction;

abstract class Bank {
    abstract void loanInterestRate();

    final void bankPolicy() {
        System.out.println("This is a final policy of the bank.");
    }
}

class SBI extends Bank {
    void loanInterestRate() {
        System.out.println("SBI Loan Interest Rate: 7%");
    }
}

public class FinalMethodTest {
    public static void main(String[] args) {
        SBI bank = new SBI();
        bank.loanInterestRate();
        bank.bankPolicy();
    }
}

