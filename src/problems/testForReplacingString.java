package problems;
import java.util.ArrayList;
import java.util.List;

public class testForReplacingString {

	public testForReplacingString() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<String> fizzBuzz(final int n){
		
		final List<String> toReturn = new ArrayList<>(n);
		
		for (int i = 1; i<=n; i++) {
			if (i%15 == 0 ){
			toReturn.add("div15");
			}else if (i%5 ==0 ) {
				toReturn.add("div5");
			}else if (i%3 ==0) {
				toReturn.add("div3");
			}else {
				toReturn.add(Integer.toString(i));
			}
		}
		return toReturn;
	}
	
	public static void main(String[] args) {
		
		int n = 16;
		List<String> printReturn= new ArrayList<>();
		printReturn = fizzBuzz(n);
		for (int i=0; i< printReturn.size(); i++) {
	    System.out.println(" return == " + printReturn.get(i));	
	    
	    System.out.println("9 divided by 3 = " + 9/3 );
		}
		
	}

}
