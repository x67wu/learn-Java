package basics1;

public class Fish implements SharkFamily{
	public Fish() {
		System.out.print(1);
	}
	
	public double getLongestFinLength() {
		return 10;
	}
	
	static double methodToTry() {
		return 100;
	}
	
	public static void main(String[] args) {
		Fish yu = new Fish();
		System.out.println(yu.doFinsHaveScales());
	}
}
