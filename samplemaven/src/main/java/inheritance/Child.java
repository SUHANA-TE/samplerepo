package inheritance;

public class Child extends Parent {
	public void show()
	{
		System.out.println("Child");
	}
	public static void main(String[] args) {
Child obj=new Child();
obj.show();
obj.print();
obj.display();


	}

}
