package parkingLotManager;


import java.util.ArrayList;
import java.util.List;

import parkingSpot.ParkingSpot;
import parkingSpot.TwoWheelerParkingSpot;
import parkingStrategy.ParkingStrategy;

public class TwoWheelerParkingLotManager extends ParkingLotManager<TwoWheelerParkingSpot> {

	private List<TwoWheelerParkingSpot> list = new ArrayList<>();
	

	
	public TwoWheelerParkingLotManager(ParkingStrategy parkingStrategy,List<TwoWheelerParkingSpot> list) {
		super(parkingStrategy,list);
		// TODO Auto-generated constructor stub
	}

	
     

	
	

}
