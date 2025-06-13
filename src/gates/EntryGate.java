package gates;

import parkingLotManager.ParkingLotManager;
import parkingSpot.ParkingSpot;
import util.Ticket;
import vehicle.Vehicle;

public class  EntryGate<T extends ParkingSpot> {

    private final ParkingLotManager<T> manager;

    public EntryGate(ParkingLotManager<T> manager) {
        this.manager = manager;
    }

    public Ticket enter(Vehicle vehicle) {
        T spot = manager.findParkingSpace();
        if (spot == null) {
            System.out.println("No available spot.");
            return null;
        }
        spot.parkVehicle(vehicle);
        return new Ticket(vehicle, spot.getId());
    }
}