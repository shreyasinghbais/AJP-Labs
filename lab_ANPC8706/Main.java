//lab_1_(8706)
//Due date: Thursday, 18 July 2024, 5:30 AM
//Maximum number of files: 1
//Type of work: Individual work
//Scenario: 
//Create a base class called Device and a derived class called Smartphone. 
//The Device class should contain attributes for brand and model, along with methods to display device information and power on/off. The Smartphone class should inherit from Device and include additional attributes for operatingSystem and cameraResolution, along with methods to display smartphone-specific information and take a photo.
//
//Requirements: 
//Implement the Device class with the required attributes and methods.
//Implement the Smartphone class that inherits from Device and adds its own attributes and methods.
//Create an instance of Smartphone, set its attributes, and demonstrate the usage of all methods.

package lab_ANPC8706;

public class Main {
	public static void main(String[] args) {
		Smartphone d1 = new Smartphone("Apple", 11.02, "iOS", "64Pixel");
		d1.displayInfo();
		d1.takePhoto();
		d1.displayPowerOnOrOff("On");
	}
}
