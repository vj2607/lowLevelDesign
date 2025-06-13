package parkingStrategy;

import java.util.List;

import parkingLotManager.ParkingLotManager;
import parkingSpot.ParkingSpot;

public class NearToElevatorStrategy<T extends ParkingSpot> implements ParkingStrategy<T>{

	

	

	@Override
	public T findSpace(ParkingLotManager<T> parkingLotManager) {
		List<T> parkingSpotList = parkingLotManager.getParkingSpotList();
		for(T spot :parkingSpotList)
			if(spot.isEmpty())
				return spot;
		return null;
	}

}
