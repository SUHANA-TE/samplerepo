package inheritance;

import accessmodifiers.Accessmodifier1;

public class Accessmodifier3 extends Accessmodifier1 {

	public static void main(String[] args) {
		Accessmodifier1 obj=new Accessmodifier1();
		obj.display();
		Accessmodifier3 obj1= new Accessmodifier3();
		obj1.display();
		obj1.display2();

	}

}
