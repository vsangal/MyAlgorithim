package lambda;
import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaConsumerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
	    numbers.add(4);
	    numbers.add(5);
	    numbers.add(1);
	    numbers.add(6);
	    
	    Consumer<Integer> method = (n) -> { System.out.println(n); };
	    
	    numbers.forEach( method );
	    
	}

}
