package parkingSpot;

import vehicle.Vehicle;
import vehicle.VehicleType;

public  class ParkingSpot {
      int id;
      Vehicle vehicle;
      boolean isEmpty;
      VehicleType allowedType;
      
     
   public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public VehicleType getAllowedType() {
		return allowedType;
	}

	public void setAllowedType(VehicleType allowedType) {
		this.allowedType = allowedType;
	}

public   ParkingSpot(int id,VehicleType isAllowedType){
    	  this.id=id;
    	  this.isEmpty=true;
    	  
    	  this.allowedType=isAllowedType;
      }
      
       	public void parkVehicle(Vehicle v) {
  		if(!isEmpty) {
  			System.out.println("Vehicle cannot be parked as parking Spot is full");
  		}
  		if( ! allowedType.equals(v.getType())) {
  			System.out.println("Incompatible parking spot");
  		}
  		this.isEmpty=false;
  		this.vehicle=v;
  		System.out.println("Parked the vehicle with vehicle number::"+v.getVehicleNumber());

  	     }

  	
        public void removeVehicle() {
            if (isEmpty) {
                System.out.println("Spot " + id + " is already empty!");
                return;
            }
            System.out.println("Vehicle " + vehicle.getVehicleNumber() + " removed from " + id);
            this.vehicle = null;
            this.isEmpty = true;
        }


}
