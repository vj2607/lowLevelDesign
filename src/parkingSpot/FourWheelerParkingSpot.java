package parkingSpot;

import vehicle.VehicleType;

public class FourWheelerParkingSpot extends ParkingSpot {

	

	
	public FourWheelerParkingSpot(int id, VehicleType isAllowedType) {
		super(id, isAllowedType);
		// TODO Auto-generated constructor stub
	}

	int price() {
		
		return 50;
	}

	

}
