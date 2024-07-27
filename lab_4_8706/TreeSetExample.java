package lab_4_8706;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
 
public class TreeSetExample {
	 public static void main(String[] args) {
	        Scanner io = new Scanner(System.in);
	        System.out.print("Enter a list of strings: ");
	        String list = io.nextLine();
	        
	        String[] words = list.split(" ");
	        TreeSet<String> result = new TreeSet<>(Arrays.asList(words));
	        System.out.println(result);
	        
	        io.close();
	}
}
