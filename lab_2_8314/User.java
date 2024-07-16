//lab -2 (8314)
//Due date: Wednesday, 24 July 2024, 5:30 AM
//Maximum number of files: 1
//Type of work: Individual work
//
//Create a custom exception class InvalidEmailException that is thrown when a user tries to create a User object 
//with an invalid email address (does not contain "@"). The exception class should have a constructor that takes a
//message as a parameter.
//
//Task:
//Write the Java code for the InvalidEmailException class and modify the User class to throw this exception
//in the constructor if the email address is invalid.


package lab_2_8314; 

public class User {
	private String email;  
	
	public User(String email) throws InvalidEmailException {
		super();
		this.email = email;
		if(email.contains("@")) {
			System.out.println("Registered successfully.");
		}
		else {
			throw new InvalidEmailException("This Email is not valid.");
		}
	}
	public User() {}
	
}
