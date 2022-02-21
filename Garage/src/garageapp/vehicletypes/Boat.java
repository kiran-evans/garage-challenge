package garageapp.vehicletypes;

public class Boat extends garageapp.Vehicle {
	private int personCapacity;
	
	public Boat(int personCapacity) {
		this.personCapacity = personCapacity;
	}
	
	public int getPersonCapacity() {
		return personCapacity;
	}
	
	public void setPersonCapacity(int personCapacity) {
		this.personCapacity = personCapacity;
	}
}
