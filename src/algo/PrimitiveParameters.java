package algo;/* In Java, every variable has a type declared in the source code.
 * There are two kinds of types: reference types and primitive types. 
 * Reference types are references to objects. Primitive types directly contain values. 
 * There are 8 primitive types:
byte
short
int
long
char
float
double
boolean
*/


public class PrimitiveParameters
{	
	public static void main(String[] args)
	{	
//		go();
//	}
//	
//	public static void go()
//	{	
		int x = 1;
		int y = 2;
		System.out.println("In method go. x: " + x + " y: " + y);
		falseSwap(x,y);
		System.out.println("in method go. x: " + x + " y: " + y);
		moreParameters(x,y);
		System.out.println("in method go. x: " + x + " y: " + y);
		replace(x,y);
		System.out.println("in method go, after replace x: " + x + " y: " + y);
	}
	
	public static void falseSwap(int x, int y)
	{	System.out.println("Before: in method falseSwap. x: " + x + " y: " + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("After: in method falseSwap. x: " + x + " y: " + y);
	}
	
	public static void replace(int x, int y)
	{	System.out.println("Before: in method replace. x: " + x + " y: " + y);
		x = y;
		System.out.println("After: in method replace. x: " + x + " y: " + y);
	}
	
	public static void moreParameters(int a, int b)
	{	System.out.println("Before: in method moreParameters. a: " + a + " b: " + b);
		a = a * b;
		b = 12;
		System.out.println("After: in method moreParameters. a: " + a + " b: " + b);
//		falseSwap(b,a);
//		System.out.println("in method moreParameters. a: " + a + " b: " + b);	
	}
}
