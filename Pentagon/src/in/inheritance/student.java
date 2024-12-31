package in.inheritance;

public class student extends human {
	int identity;
	int stand;
	student(String name,int age,int id,int std){
		super(name,age);
		
		identity=id;
		stand=std;
	}

	public static void main(String[] args) {
		student s=new student("suresh",24,81,17);
		System.out.println("info:: "+s.name+" "+s.age+" "+s.identity+" "+s.stand);
	}

}
