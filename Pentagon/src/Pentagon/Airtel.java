package Pentagon;

public class Airtel {
		void recharge(long cardnum,String expDate,int cvv) {
	    System.out.println("recharging through card ");
	}
	void recharge(long mobileNum,int pin ) {
	    System.out.println("recharging through upi  ");
	}
	void recharge(int pass,long accNum) {
	    System.out.println("recharging through Net payment ");
	}
	void recharge(String bankName,long cardnum,int cvv) {
	    System.out.println("recharging through wallet ");
	}

	public static void main(String[] args) {
		Airtel a=new Airtel();
		a.recharge(1334567899l,"14/12",1234);
		a.recharge(1234,123456789456l);
		a.recharge("union bank",12345679983l,1234);
		a.recharge(7799465956l,1234);
		
	}

}
