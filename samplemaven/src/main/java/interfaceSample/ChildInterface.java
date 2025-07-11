package interfaceSample;

public class ChildInterface implements ParentInterface {

	public static void main(String[] args) {
		ChildInterface obj=new ChildInterface();
		obj.display();
		obj.print();

	}

	@Override
	public void display() {
		System.out.println("Parent Interface");
		
	}

	@Override
	public void print() {
		System.out.println("Child Interface");
		
	}

}
