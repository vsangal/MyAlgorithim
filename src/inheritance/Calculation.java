package inheritance;

public class Calculation {
	int z;
	
	public Calculation() {
		System.out.println("I am posting from constructor");
	}
	
	public void addition(int x, int y) {
	      z = x + y;
	      System.out.println("The sum of the given numbers:"+z);
	   }
		
	   public void Subtraction(int x, int y) {
	      z = x - y;
	      System.out.println("The difference between the given numbers:"+z);
	   }
}
