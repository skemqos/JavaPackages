package packageB;

public class TestClass {

	public static void main(String[] args) {
		/*
		 * Vehicle car1 = new Vehicle(7049); car1.getVehicalNumber();
		 */
		 Vehicle car2 =  new VehicleBMW(7049);
		 car2.getVehicalNumber();
		 car2.getCount();
		 
		 VehicleBMW.getCount();
		 VehicleBMW car3 =  new VehicleBMW(1749);
		 car3.getCount();
	}

}
