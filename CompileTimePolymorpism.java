package oops.polymorpism;

public class CompileTimePolymorpism {
//	overloading is an example of compile time polymorpism
	public static void main(String[] args) {
		System.out.println(add(8, 07));
		System.out.println(add(.98, 65));
		System.out.println(add(8, 7.6));
		System.out.println(add(.98, 6.5));
		
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, double b) {
		return (int) (a + b);
	}

	public static int add(double a, int b) {
		return (int) (a + b);
	}

	public static int add(double a, double b) {
		return (int) (a + b);
	}
}
