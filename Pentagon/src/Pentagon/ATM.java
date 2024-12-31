package Pentagon;

public class ATM {
	money dispense() {
	    money t=new money();
			System.out.println("ATM dispense money using pin");
			return t;
			}

	public static void main(String[] args) {
		ATM a=new ATM();
		a.dispense();
	}

}
