package garageapp.vehicletypes;

public class Car extends garageapp.Vehicle {
	private int numberOfDoors;
	private String engineType;
	
	public Car(int numberOfDoors, String engineType) {
		this.numberOfDoors = numberOfDoors;
		this.engineType = engineType;
	}
	
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	
	public void setNumberOfDoors(int doors) {
		this.numberOfDoors = doors;
	}
	
	public String getEngineType() {
		return engineType;
	}
	
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
}