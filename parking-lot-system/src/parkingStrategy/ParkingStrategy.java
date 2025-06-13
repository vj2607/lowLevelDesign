package parkingStrategy;

import parkingLotManager.ParkingLotManager;
import parkingSpot.ParkingSpot;

public interface ParkingStrategy<T extends ParkingSpot> {

	T findSpace(ParkingLotManager<T> parkingLotManager  );
}
