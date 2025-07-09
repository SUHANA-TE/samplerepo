package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent{
public SuperConstructorChild()

{
	super(1,2);
	System.out.println("child constructor");
}
	public static void main(String[] args) {
		SuperConstructorChild obj=new SuperConstructorChild();

	}

}
