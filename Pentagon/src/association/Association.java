package association;

class student {
	String name ;
	student(String name){
		this.name=name ;
	}
}
class university{
	String uname ;
	student std;
	
	public university(String uname,student std) {
		this.uname=uname;
		this.std=std;
		System.out.println(uname);
		System.out.println(std);
	}
	
	public String getUname() {
		return uname;
	}
	public student getStudent() {
		return std;
	}
}
public class Association {
	
student s=new student("suresh") ;

university u=new university("sisdas", s);

}

