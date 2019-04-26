package basics1;

public class Fish2 extends Fish {
	public Fish2(int age) { System.out.print("2"); }

	public Fish2() {

		this(5);
		System.out.print(3.);
	}	
	
	public static void main(String[] args) {
		Fish2 f = new Fish2();
		String year = "aaaa";
		switch(year) {
			default: System.out.println("Sophomore"); break;
			case "Senior" : System.out.println("See you next year");
			case "Junior" : System.out.println("Congratulations");
		}
		//System.out.println(methodToTry());
	}
}
