package association;

 class engine {
	void start () {
		System.out.println("started");
	}
}
class car{
	engine e;
	car(){
		System.out.println("nnnnn");
	}
	car(engine e){
		this.e=e;
	}
	void drive (){
		System.out.println("car driving");
		try{
			e.start();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class carTest {
public static void main(String[] args) {
//	engine e= new engine();
	
	car c=new car();
	c.drive();
//	e.start();
}
}
