package abstraction;

public class AbstractChild extends AbstractParent{
	

	public static void main(String[] args) {
		AbstractChild obj=new AbstractChild();
		obj.display();
		obj.print();

	}

	@Override
	public void display() {
		System.out.println("Abstract Child");
		
	}

	@Override
	public void print() {
		System.out.println("Abstarct Parent");
		
	}

}
