package in.GarbageCollection;

public class callinggc {
	@Override
	protected void finalize() throws Throwable {
		System.out.println(" object id delected by calling fanilize" + this);

	}

	public static void main(String[] args) {
		new callinggc();
		callinggc c = new callinggc();
		callinggc c1 = c;
		c1 = null;
		System.gc();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main ended");
	}
}
