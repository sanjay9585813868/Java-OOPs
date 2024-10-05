package oops.polymorpism;

public class mainClass {
	public static void main(String[] args) {
//Runtime polymorpism
		Bank b;
		b = new SBI();
		System.out.println(b.intrest());
		b = new HDFC();
		System.out.println(b.intrest());

	}
}

class Bank {
	int intrest = 0;
	String msg="Bank intrest rate is ";

	String intrest() {
		return msg+intrest;
	}
}

class SBI extends Bank {
	int intrest = 3;
	String intrest() {
		return msg+intrest;
	}
}

class HDFC extends Bank {
	int intrest = 6;
	String intrest() {
		return msg+intrest;
	}
}
