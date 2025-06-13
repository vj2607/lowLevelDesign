package parkingSpot;

import vehicle.VehicleType;

public class TwoWheelerParkingSpot extends ParkingSpot {

	
	public TwoWheelerParkingSpot(int id, VehicleType isAllowedType) {
		super(id, isAllowedType);
		// TODO Auto-generated constructor stub
	}

	int price() {
		
		return 20;
	}

	
}
