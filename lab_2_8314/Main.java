package lab_2_8314;

public class Main {
	public static void main(String[] args) {
		// Valid email
		try {
	      User user1 = new User("asdf@.com"); 
	    } catch (InvalidEmailException e) {
	    	e.printStackTrace(); 
	    }
		// Invalid email
		try {
			User user1 = new User("asdf.com"); 
	    } catch (InvalidEmailException e) {
	    	e.printStackTrace(); 
	    }
		
	}
}
