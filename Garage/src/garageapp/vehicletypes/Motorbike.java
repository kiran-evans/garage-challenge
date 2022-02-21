package garageapp.vehicletypes;

public class Motorbike extends garageapp.Vehicle {
	private int engineCc;
	
	public Motorbike(int engineCc) {
		this.engineCc = engineCc;
	}
	
	public int getEngineCc() {
		return engineCc;
	}
	
	public void setEngineCc(int cc) {
		this.engineCc = cc;
	}
}