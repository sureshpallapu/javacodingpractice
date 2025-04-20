package in.InstanceBlocksExamples;

public class MultipleInstanceBlocks {
	// First instance block
	{
		System.out.println("Instance Block 1");
	}

	// Second instance block
	{
		System.out.println("Instance Block 2");
	}

	// Constructor
	MultipleInstanceBlocks() {
		System.out.println("Constructor executed");
	}

	public static void main(String[] args) {
		MultipleInstanceBlocks obj = new MultipleInstanceBlocks();
	}
}
