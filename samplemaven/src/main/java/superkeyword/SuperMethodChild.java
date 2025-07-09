package superkeyword;

public class SuperMethodChild extends SuperMethodParent{
	public void display()
	{
		super.print();
		System.out.println("child method");
	}

	public static void main(String[] args) {
		
		SuperMethodChild obj=new SuperMethodChild();
		obj.display();
	}

}
