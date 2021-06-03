package constructor;
class languages {
	int no , marks;
	String color;
	
	languages(int no) {
		this.no = no;
		color = "black";
	}
}
public class Practice {

	public static void main(String[] args) {

		languages java = new languages(10);
		languages python = new languages(8);
		System.out.print(java.no +" "+python.color + " " + java.color + " " +python.no);

	}

}
