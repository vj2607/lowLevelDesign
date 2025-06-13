package abstractFactory;

public class Main {
public static void main(String[] args) {
	

	MasterFactory ms = new MasterFactory();
	VehicleFactory v = ms.getVehicleFactory("Luxury");
	   Vehicle vehicle = v.getVehicle("BMW");
	   
	   vehicle.drive();
	   VehicleFactory v2 = ms.getVehicleFactory("Ordinary");
	   Vehicle vehicle2 = v2.getVehicle("Swift");
	   vehicle2.drive();
}
}
