package abstractFactory;

public class MasterFactory {

	VehicleFactory getVehicleFactory(String type ) {
		if(type.equalsIgnoreCase("Luxury")) {
			return new LuxuryVehicleFactory();
		}
		
		else	if(type.equalsIgnoreCase("Ordinary")) {
			return new OrdinaryVehicleFactory();
		}
		
		return null;
	}
}
