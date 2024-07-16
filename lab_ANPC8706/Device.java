package lab_ANPC8706;

public class Device {
	public String brand;
	public double model;
	
	public Device(String brand, double model) {
		super();
		this.brand = brand;
		this.model = model;
	}
	public Device() {};
	 
	public void displayInfo() {
		System.out.println("Brand of Device: " + brand);
		System.out.println("Model of Device: " + model);
	}
	public void displayPowerOnOrOff(String onOrOff) {
		System.out.println("Device is currently power " + onOrOff);
	}
	
}
