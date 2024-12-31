package Pentagon;

public class conductor {
	ticket issue() {
    ticket t=new ticket();
		System.out.println("conductor issues tickets");
		return t;
		}
	public static void main(String[] args) {
		conductor c=new conductor();
	      c.issue();


	}

}
