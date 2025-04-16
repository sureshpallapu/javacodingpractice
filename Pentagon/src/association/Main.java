package association;

public class Main {

	public static void main(String[] args) {
	Water w=new Water("Golden Fish");
     System.out.println(w.getFish());
     System.out.println(w);
     
     Student s=new Student("Suresh ");
     Trainer t=new Trainer("Vishwas Sir ",s);
     System.out.println(t.getName()+" "+ t.getStudentName());
     System.out.println(t);
     System.out.println(s);
     
	}

}

