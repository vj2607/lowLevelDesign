package parkingLotManager;


import java.util.List;

import parkingSpot.ParkingSpot;
import parkingStrategy.ParkingStrategy;
import vehicle.Vehicle;

public class ParkingLotManager<T extends ParkingSpot> {
	
	List<T> ParkingSpotList;
	
	ParkingStrategy<T> parkingStrategy;
	
	public ParkingLotManager(ParkingStrategy<T> parkingStrategy,List<T> parkingSpots) {
		this.ParkingSpotList = parkingSpots;
		this.parkingStrategy = parkingStrategy;
	}

	public T findParkingSpace() {
     return parkingStrategy.findSpace(this);
	}
	void addParkingSpace(T parkingSpot) {
		ParkingSpotList.add(parkingSpot);
	}
	void removeParkingSpace(T parkingSpot  ) {
		ParkingSpotList.remove(parkingSpot);
	}
	void parkVehicle(Vehicle vehicle) {
		 T spot = findParkingSpace();
	        if (spot == null) {
	            System.out.println("No parking spot available.");
	            return;
	        }
	        if (!spot.getAllowedType().equals(vehicle.getType())) {
	            System.out.println("Cannot park vehicle. Incompatible type for spot " + spot.getId());
	            return;
	        }
	        spot.parkVehicle(vehicle);
	    }
	
	void removeVehicle(int spotId) {
		for (T spot : ParkingSpotList) {
            if (spot.getId() == spotId) {
                spot.removeVehicle();
                return;
            }
        }
        System.out.println("Parking spot with ID " + spotId + " not found.");
    }
	
	
	public List<T> getParkingSpotList() {
		return ParkingSpotList;
	}

	public void setParkingSpotList(List<T> parkingSpotList) {
		ParkingSpotList = parkingSpotList;
	}
}
