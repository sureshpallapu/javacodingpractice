package in.InstanceBlocksExamples;

public class InstanceExample {
    // Instance block
    {
        System.out.println("Instance block executed");
    }

    // Constructor
    InstanceExample() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
    	InstanceExample obj1 = new InstanceExample(); // Instance block + Constructor will execute
    	InstanceExample obj2 = new InstanceExample(); // Instance block + Constructor will execute again
    }
}
