package lambda;

interface MyFunction {
	  String run(String str);
	}

public class UserDefinedLambda {

	public static void main(String[] args) {
		
		MyFunction exclaim = (s) -> s + "!";
		MyFunction ask = (s) -> s + "?";
	    printFormatted("Hello", exclaim);
	    printFormatted("Hello", ask);

	}
	  public static void printFormatted(String str, MyFunction myInterface) {
	   
		  String result = myInterface.run(str);
		  //myInterface.run(str);
	    
	    System.out.println(result);
	  }

}
