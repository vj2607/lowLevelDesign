package parkingLotMain;

import java.util.ArrayList;
import java.util.List;

import gates.EntryGate;
import gates.ExitGate;
import parkingLotManager.FourWheelerParkingLotManager;
import parkingLotManager.TwoWheelerParkingLotManager;
import parkingSpot.FourWheelerParkingSpot;
import parkingSpot.TwoWheelerParkingSpot;
import parkingStrategy.NearToElevatorStrategy;
import util.Ticket;
import vehicle.Vehicle;
import vehicle.VehicleType;

public class Main {

	public static void main(String[] args) {
		 // Create Two-Wheeler Spots
        List<TwoWheelerParkingSpot> twoWheelerSpots = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            twoWheelerSpots.add(new TwoWheelerParkingSpot(i, VehicleType.TWO_WHEELER));
        }

        // Create Four-Wheeler Spots
        List<FourWheelerParkingSpot> fourWheelerSpots = new ArrayList<>();
        for (int i = 4; i <= 6; i++) {
            fourWheelerSpots.add(new FourWheelerParkingSpot(i, VehicleType.FOUR_WHEELER));
        }

        // Managers
        TwoWheelerParkingLotManager twoWheelerManager =
                new TwoWheelerParkingLotManager(new NearToElevatorStrategy<>(), twoWheelerSpots);

        FourWheelerParkingLotManager fourWheelerManager =
                new FourWheelerParkingLotManager(new NearToElevatorStrategy<>(), fourWheelerSpots);

        // Entry & Exit Gates
        EntryGate<TwoWheelerParkingSpot> twoWheelerEntry = new EntryGate<>(twoWheelerManager);
        ExitGate<TwoWheelerParkingSpot> twoWheelerExit = new ExitGate<>(twoWheelerManager);

        EntryGate<FourWheelerParkingSpot> fourWheelerEntry = new EntryGate<>(fourWheelerManager);
        ExitGate<FourWheelerParkingSpot> fourWheelerExit = new ExitGate<>(fourWheelerManager);

        // Create and park vehicles
        Vehicle bike = new Vehicle("MH01-2222", VehicleType.TWO_WHEELER);
        Vehicle car = new Vehicle("MH01-4444", VehicleType.FOUR_WHEELER);

        System.out.println("\n--- Two Wheeler Entry ---");
        Ticket bikeTicket = twoWheelerEntry.enter(bike);

        System.out.println("\n--- Four Wheeler Entry ---");
        Ticket carTicket = fourWheelerEntry.enter(car);

        // Simulate wait time
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("\n--- Two Wheeler Exit ---");
        if (bikeTicket != null) twoWheelerExit.exit(bikeTicket);

        System.out.println("\n--- Four Wheeler Exit ---");
        if (carTicket != null) fourWheelerExit.exit(carTicket);
    }
}
