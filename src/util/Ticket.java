package util;

import java.time.LocalDateTime;

import parkingSpot.ParkingSpot;
import vehicle.Vehicle;

public class Ticket {

	 private static int counter = 1;
	    private final int ticketId;
	    private final Vehicle vehicle;
	    private final int spotId;
	    private final LocalDateTime entryTime;
	    private LocalDateTime exitTime;
	    private double cost;

	    public Ticket(Vehicle vehicle, int spotId) {
	        this.ticketId = counter++;
	        this.vehicle = vehicle;
	        this.spotId = spotId;
	        this.entryTime = LocalDateTime.now();
	    }

	    public void setExitTime(LocalDateTime exitTime) {
	        this.exitTime = exitTime;
	    }

	    public void setCost(double cost) {
	        this.cost = cost;
	    }

	    public long getDurationInHours() {
	        return java.time.Duration.between(entryTime, exitTime).toHours();
	    }

		public static int getCounter() {
			return counter;
		}

		public int getTicketId() {
			return ticketId;
		}

		public Vehicle getVehicle() {
			return vehicle;
		}

		public int getSpotId() {
			return spotId;
		}

		public LocalDateTime getEntryTime() {
			return entryTime;
		}

		public LocalDateTime getExitTime() {
			return exitTime;
		}

		public double getCost() {
			return cost;
		}

	    // Getters
	}
