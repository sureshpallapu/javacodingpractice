package in.EnumExamples;


/*Enum in Java:
	
Enums in Java (enum) are a special data type used to define a collection of constants. 
They improve code readability, maintainability, and 
type safety by restricting values to a predefined set.
*/

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class EnumExample {
	public static void main(String[] args) {
		Day today = Day.WEDNESDAY;
		System.out.println("Today is: " + today);
	}
}
