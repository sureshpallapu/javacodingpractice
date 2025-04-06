package in.ObjectClass;

class Demo {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object is being garbage collected!");
	}
}

public class FinalizeExample {
	public static void main(String[] args) {
		Demo d = new Demo();
		d = null;
		System.gc(); // Requests garbage collection
	}
}
