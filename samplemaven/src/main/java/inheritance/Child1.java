package inheritance;

public class Child1 extends Parent1 {
public void print()
{
	System.out.println("child1");
}

	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.print();
		obj.display();

	}

}
