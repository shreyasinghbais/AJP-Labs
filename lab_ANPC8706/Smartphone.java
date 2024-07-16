package lab_ANPC8706;

public class Smartphone extends Device{
	public String os;
	public String cameraResolution;
	
	public Smartphone(String brand, double model, String os, String cameraResolution) {
		super(brand, model);
		this.os = os;
		this.cameraResolution = cameraResolution; 
	}
	public Smartphone() {};
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Operating System Version: " + os);
		System.out.println("Camera resolution: " + cameraResolution);
	}
	public void takePhoto() {
		System.out.println("Picture is clicked by: " + super.brand + super.model);
	}
	
}
