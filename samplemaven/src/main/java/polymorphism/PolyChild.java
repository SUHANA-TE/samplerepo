package polymorphism;

public class PolyChild extends PolyParent{
	 public void add(int a,int b)
	 {
		 super.add(3, 4);
	 	int c=a-b;
	 	System.out.println(c);
	 }
	public static void main(String[] args) {
		PolyChild obj=new PolyChild();
		obj.add(2, 1);

	}

}
