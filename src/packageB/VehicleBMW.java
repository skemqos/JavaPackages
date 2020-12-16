package packageB;

public class VehicleBMW extends Vehicle {
	
	int modelNumber;

	public VehicleBMW(int i) {
	super(i);
	System.out.println("Inside VehicleBMW contructor started");
	System.out.println("Inside BMW");
	}

	public int getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	public int getVehicalNumber() {
		System.out.println("inside VehicleBMW vehicalNumber"+vehicalNumber);
		return vehicalNumber;
	}
	
	
	public static void getCount() {
		System.out.println("inside VehicleBMW vehical count as of now"+count);
	}
}
