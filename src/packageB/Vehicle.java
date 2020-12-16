package packageB;

public class Vehicle {

	int vehicalNumber;
	static int count;
	int countdummy;
	static {
		System.out.println("Inside static block");
	}
	
	
	  public Vehicle(int number) { 
		  super();
	  System.out.println("countdummy value"+countdummy);
	  System.out.println("count value"+count); this.vehicalNumber = number;
	  count++;countdummy++; }
	 
	  public Vehicle() {
		  System.out.println("Inside contructor");
	  }
	public void getCountdummy() {
		System.out.println("vehical count as of now"+countdummy);
	 
	}

	public void setCountdummy(int countdummy) {
		this.countdummy = countdummy;
	}

	public int getVehicalNumber() {
		System.out.println("vehicalNumber"+vehicalNumber);
		return vehicalNumber;
	}
	
	public void setVehicalNumber(int vehicalNumber) {
		this.vehicalNumber = vehicalNumber;
	}
	public static void getCount() {
		System.out.println("vehical count as of now"+count);
	}
}
