package vehicle;

public class Vehicle {
     String vehicleNumber;
     VehicleType type;
	public Vehicle(String number, VehicleType type) {
		this.vehicleNumber=number;
		this.type=type;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public VehicleType getType() {
		return type;
	}
	public void setType(VehicleType type) {
		this.type = type;
	}
}
