package abstractFactory;

public class LuxuryVehicleFactory implements VehicleFactory {

	@Override
	public Vehicle getVehicle(String name) {
		// TODO Auto-generated method stub
		if(name.equals("Mercedes"))
		return new Mercedes();
		
		else if(name.equals("BMW"))
			return new BMW();
		
		return null;
	}

}
