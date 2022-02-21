package garageapp;

import java.util.ArrayList;
import garageapp.vehicletypes.*;

public class Garage {
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	private int currentId = 0;
	
	public Garage() {
		
		Car car1 = new Car(5, "Petrol");
		car1.setColour("Black");
		car1.setId(currentId);
		currentId++;
		vehicles.add(car1);
		
		Car car2 = new Car(3, "Diesel");
		car2.setColour("Red");
		car2.setId(currentId);
		currentId++;
		vehicles.add(car2);

		Car car3 = new Car(5, "Electric");
		car3.setColour("Green");
		car3.setId(currentId);
		currentId++;
		vehicles.add(car3);
		
		Motorbike mb1 = new Motorbike(500);
		mb1.setColour("Black");
		mb1.setId(currentId);
		currentId++;
		vehicles.add(mb1);
		
		Motorbike mb2 = new Motorbike(650);
		mb2.setColour("White");
		mb2.setId(currentId);
		currentId++;
		vehicles.add(mb2);
		
		Motorbike mb3 = new Motorbike(430);
		mb3.setColour("Blue");
		mb3.setId(currentId);
		currentId++;
		vehicles.add(mb3);
		
		Boat boat1 = new Boat(6);
		boat1.setColour("White");
		boat1.setId(currentId);
		currentId++;
		vehicles.add(boat1);
		
		Boat boat2 = new Boat(20);
		boat2.setColour("Red");
		boat2.setId(currentId);
		currentId++;
		vehicles.add(boat2);
		
		Boat boat3 = new Boat(8);
		boat3.setColour("Blue");
		boat3.setId(currentId);
		currentId++;
		vehicles.add(boat3);
		
	}
	
	public void fixVehicle(Vehicle veh) {
		
		double bill = 0.0;
		
		switch (veh.getClass().getSimpleName()) {
		case "Car":
			bill += veh.getNumberOfDoors() * 50;
		
		case "Motorbike":
			bill += veh.getEngineCc() * 2;
		
		case "Boat":
			bill += veh.getPersonCapacity() * 15;
		
		default:
			break;
		}
		
		System.out.println("Your bill for vehicle with ID " + veh.getId() + " is £" + bill);
	}
	
	public void calculateBill() {
		for (Vehicle veh : vehicles) {
			fixVehicle(veh);
		}
	}
	
	public void addVehicle(Vehicle veh) {
		vehicles.add(veh);
	}
	
	public void removeVehicle(int id) {
		vehicles.remove(id);
	}
	
	public void removeVehicle(String type) {
		for (Vehicle veh : vehicles) {
			if (veh.getClass().getSimpleName().toLowerCase() == type.toLowerCase()) {
				vehicles.remove(veh); 
			}
		}
	}
	
	public void emptyGarage() {
		vehicles.clear();
	}
}
