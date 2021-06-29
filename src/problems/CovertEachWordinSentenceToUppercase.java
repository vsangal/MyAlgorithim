package problems;

import java.util.HashSet;
import java.util.Set;

public class CovertEachWordinSentenceToUppercase {


	public static void main (String[] argv) {
		String mysentence =  "this is the life";
		String mysentence2 = "this is web of test";
		String mysentence3 = "this is (a the life";
		String returnString = upperCaseme(mysentence2);
		System.out.println(returnString);
		//String[] specialletter = {":", "("};
		Set<String> set = new HashSet<String>();
		set.add(":");
		set.add("(");
	}
	
	public static String upperCaseme (String mysentence) {
		
		String[] words = mysentence.split(" ");
		String returnedArray = null;
		
		boolean specialWord = false;
		
		for (int i=0; i< words.length; i++) {
			
			if (i == 0) { 
				//System.out.println(words[0].substring(0,1).toUpperCase() + words[0].substring(1));
				returnedArray = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
			} else {
				if (words[i].contains(":")) {
					returnedArray = returnedArray + " " + words[i];
				} else {
				returnedArray = returnedArray + " " + words[i].substring(0,1).toUpperCase() + words[i].substring(1);
				}
			}
			
		}
		return returnedArray;
	}
	
}
