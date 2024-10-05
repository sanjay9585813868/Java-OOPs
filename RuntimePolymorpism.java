package oops.polymorpism;

public class RuntimePolymorpism {
	/* polymorphism defined as a single action can be
	 *  performed in different ways */
	public static void main(String[] args) {

//		over ride is an example of runtime polymorphism
		parent c1;
		c1=new child1();
		c1.msg();
		c1=new child2();
		c1.msg();
		
	}
}

class parent{
	String msg="parent";
	void msg() {System.out.println("class :"+msg);}
}
class child1 extends parent{
	String msg="child1";
	void msg() {System.out.println("class :"+msg);}
}
class child2 extends parent{
	String msg="child2";
	void msg() {System.out.println("class :"+msg);}
}

