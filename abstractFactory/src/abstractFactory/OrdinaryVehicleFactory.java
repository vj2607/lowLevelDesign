package abstractFactory;

public class OrdinaryVehicleFactory implements VehicleFactory {

	@Override
	public Vehicle getVehicle(String name) {
		// TODO Auto-generated method stub
		if(name.equals("Swift"))
			return new Swift();
			
			else if(name.equals("Hyundai"))
				return new Hyundai();
			
			return null;
	}
}
