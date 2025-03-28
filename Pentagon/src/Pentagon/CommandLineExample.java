package Pentagon;

public class CommandLineExample {
	 static {
     	System.out.println("123");
     }
	 CommandLineExample(){
		 System.out.println("cons");
	 }
	 static public void main(String ...args) {
		 CommandLineExample c=new CommandLineExample ();
    	 System.out.println(" length of Command-line arguments:"+args.length);
        // Check if any arguments are provided
        if (args.length > 0) {
            System.out.println("Command-line arguments:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }
        } else {
            System.out.println("No command-line arguments provided.");
        }
       
    }
}
