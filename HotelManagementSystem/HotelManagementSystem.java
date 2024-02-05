// HotelManagementSystem class contains the main method to run the program
package hotelmanagement;
import java.util.Scanner;



@FunctionalInterface
interface AuthFun {
	boolean authenticate(String username, String Password);
}

public class HotelManagementSystem {
    

    	public static void main(String[] args) {
    		
    		// Create an array of rooms
            Room[] rooms = {
                new Room(101),
                new Room(102),
                new Room(103),
                new Room(201),
                new Room(202),
                new Room(203),
            };
            
            try {
            	Hotel hotel = new Hotel("Grand Hotel", rooms);
                Scanner scanner = new Scanner(System.in);
                HotelManagementSystem m1 = new HotelManagementSystem();
    			

    			System.out.println("\nPlease Login First to get our service\n");
    			System.out.print("User Name: ");
    			String username = scanner.nextLine();

    			System.out.print("Password : ");

    			String password = scanner.nextLine();

    			boolean result = hotel.validate(username, password);
    			if (result == true) {
    				System.out.println("\nYou Have Successfully Logged In....");
    				System.out.println(
    						"\n******************************************************");
    				System.out.println("      WELCOME TO HOTEL MANAGEMENT SYSTEM                    ");
    				System.out.println(
    						"******************************************************\n");
    				System.out.println("Please Select the Options from the below list.\n");
    				
        // Create a hotel object
        
        // Display menu and handle user input
        
        while (true) {
            System.out.println("\nHotel Management System");
            System.out.println("-----------------------\n");
            System.out.println("1. Check-in");
            System.out.println("2. Check-out");
            System.out.println("3. View available rooms");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    hotel.checkIn();
                    break;
                case 2:
                    hotel.checkOut();
                    break;
                case 3:
                    hotel.displayAvailableRooms();
                    break;
                case 4:
                    System.out.println("Exiting the system...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
        	 else {
				System.out.println("Invalid username and Password. Please Login again!");
			}
		} catch (Exception e) {
			System.out.println("An unexpected error occurred. Exiting the application.");
		}
}
    	}
