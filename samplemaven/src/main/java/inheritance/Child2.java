package inheritance;

public class Child2 extends Parent1 {
	public void show()
	{
		System.out.println("child 2");
	}

	public static void main(String[] args) {
		Child2 obj=new Child2();
		obj.show();
		obj.display();

	}

}
