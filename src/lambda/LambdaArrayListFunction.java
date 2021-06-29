package lambda;
import java.util.ArrayList;

public class LambdaArrayListFunction {

	public static void main(String[] args) {
	    
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    
	    numbers.add(4);
	    numbers.add(5);
	    numbers.add(1);
	    numbers.add(6);
	    
	    //Use a lamba expression in the ArrayList's forEach() method to print every item in the list:
	    
	    numbers.forEach( (n) -> { System.out.println(n); } );
	  }
}
