package aggregation;

public class AggregationChild {
	String city;
	String state;
	AggregationParent ref;
	public AggregationChild(String city,String state,AggregationParent ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(ref.name+""+ref.rollno+""+ref.address);
		System.out.println(city+""+state);
	}
	public static void main(String[] args) {
		AggregationParent obj1=new AggregationParent("Suhana ",30," Manzil");
		AggregationChild obj=new AggregationChild("TVPM"," Kerala",obj1);
obj.display();
	}

}
