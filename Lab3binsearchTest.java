import java.util.Arrays;


/**
 * Class that holds main, has a method to print a menu, so that main is cleaner to look at.
 * @author Thomas Stanley
 *
 */
public class Lab3binsearchTest {
	
	 static void printMenu() {
		System.out.println("Select an option in the menu");
		System.out.println("1. Initialize and populate an array of 20 random integers.");
		System.out.println("2. Perform a recursive binary search.");
		System.out.println("3. Perform a non-recursive binary serach.");
		System.out.println("4. Exit");
	}

	 /**
	  * Main displays menu and calls methods from Binarysearch class to conduct two different types of search algorithm, recursive and non-recursive.
	  * @param args contains arguments of the class
	  */
	public static void main(String[] args) {
		//new Binarysearch object created
		Binarysearch search = new Binarysearch();
		
		//while loop displays menu until exit is selected.
		while(true) {
			printMenu();
			//try catch ensures correct input entry
			try {
				
			int option = search.input.nextInt();
			
			//start of menu choices
			if(option==1) {
				System.out.println("Array of randomly generated integers: ");
				search.generateRandomInts();
				Arrays.sort(search.array);
				search.remainingElements(search.array,0,search.array.length-1);
			}else if(option==2) {
				//timer method is called to time the search
				search.recursiveTimer();
			}else if(option==3) {
				//timer method is called to time the search
				search.nonRecursiveTimer();
			}else if(option==4) {
				System.out.println("Exiting...");
				break;
			}else {
				//if user enters an integer not assigned to an option, message is displayed
				System.out.println("Invalid Input...try again");
			}
			}catch(Exception e) {
				//if there are any input mismatch exceptions, message is displayed
				System.out.println("Invalid Input...try again");
				search.input.nextLine();
			}
		}
		
	}

}
