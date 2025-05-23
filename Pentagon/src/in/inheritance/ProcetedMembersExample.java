package in.inheritance;

	class ANIMAL1 {
		  protected String name;

		  protected void display() {
		    System.out.println("I am an animal.");
		  }
		}

    class DOG2 extends ANIMAL1 {

		  public void getInfo() {
		    System.out.println("My name is " + name);
		  }
		}

		public class ProcetedMembersExample {
		  public static void main(String[] args) {

		    // create an object of the subclass
		    DOG2 d = new DOG2();

		    // access protected field and method
		    // using the object of subclass
		    d.name = "Rocky";
		    d.display();

		    d.getInfo();
		  }
		}

