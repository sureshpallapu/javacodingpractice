package StaticProgramex;

public class MyClass {
 static int objectCount = 0;
// Constructor increments the count when a new object is created
	public MyClass() {
		objectCount++;
	}

//	// Method to get the current object count
//	public static int getObjectCount() {
//		return objectCount;
//	}

	public static void main(String[] args) {
		// Creating objects of MyClass
		MyClass obj1 = new MyClass();
		System.out.println("Total objects created: " +objectCount );
		MyClass obj2 = new MyClass();
		System.out.println("Total objects created: " +obj2.objectCount );
		MyClass obj3 = new MyClass();
		System.out.println("Total objects created: " +obj2.objectCount );
		MyClass obj4= new MyClass();
		System.out.println("Total objects created: " +obj2.objectCount );
		// Printing the total number of objects created
		//System.out.println("Total objects created: " +obj2.objectCount );
	}
}
