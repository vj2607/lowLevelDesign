package gates;

import java.time.LocalDateTime;

import parkingLotManager.ParkingLotManager;
import parkingSpot.ParkingSpot;
import util.Ticket;

public class ExitGate<T extends ParkingSpot> {

    private final ParkingLotManager<T> manager;

    public ExitGate(ParkingLotManager<T> manager) {
        this.manager = manager;
    }

    public void exit(Ticket ticket) {
        int spotId = ticket.getSpotId();
        for (T spot : manager.getParkingSpotList()) {
            if (spot.getId() == spotId) {
                spot.removeVehicle();
                ticket.setExitTime(LocalDateTime.now());
                double cost = calculateCost(ticket);
                ticket.setCost(cost);
                System.out.println("Total parking cost: ₹" + cost);
                return;
            }
        }
        System.out.println("Invalid spot for ticket.");
    }

    private double calculateCost(Ticket ticket) {
        long hours = Math.max(ticket.getDurationInHours(), 1); // at least 1 hour charged
        return hours * 50.0; // ₹50 per hour
    }
}
