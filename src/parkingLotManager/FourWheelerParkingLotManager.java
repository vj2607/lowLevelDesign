package parkingLotManager;


import java.util.List;

import parkingSpot.FourWheelerParkingSpot;

import parkingStrategy.ParkingStrategy;

public class FourWheelerParkingLotManager extends ParkingLotManager<FourWheelerParkingSpot> {

	public FourWheelerParkingLotManager(ParkingStrategy parkingStrategy,List<FourWheelerParkingSpot> list) {
		super(parkingStrategy, list);
		
	}

	

}
