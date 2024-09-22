/*
Program Name: Module 6 Final Option 2
Author: Nathan Curtis
Date: 9/22/2024
-------------------
Requirements:
    Create home inventory class to maintain available houses in country
        private int square_feet
        private string address
        private string city
        private string state
        private int zip_code
        private string Model_name
        private string sale_status (sold, available, or under contract)
    Have methods succh as
        Constructor
        add new home
        remove home
        update home attributes
    Inculde try..catch constructs
        Should return a success or failure message
-------------------
Pseudocode:
    HomeInventory (seperate file)
        private int square_feet;
        private String address;
        private String city;
        private String state;
        private int zip_code;
        private String Model_name;
        private String sale_status;
        
        public Homeinventory (uses previously listed variables as parameters)
            this.variable = variable
            repeat for all
    
    Import scanner
    Main
        main
            while loop
                Switch choice
                    1: add
                    2: delete
                    3: update
                    4: print
                    5: exit
                    except: invalid choice
        add home
            Add house information
        delete home
            Delete house information
        update home
            Update house infomatino
        upload information
            Take house information and put into text file
        get information for other functions?
            Get user input for the house information they want to use for the other functions?

*/
import java.util.Scanner;
import java.util.ArrayList; // Allpws array lists
import java.util.List; // Allows lists

public class main {
    //Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int choice;
        String returnCondition;

        while(mainLoop == true) {
            System.out.println("Navigation Menu \n");
            System.out.print("1 - Add new home into inventory\n");
            System.out.print("2 - Remove a home from inventory\n");
            System.out.print("3 - Update a home from inventory\n");
            System.out.print("4 - Print inventory\n");
            System.out.print("5 - Exit\n");
            System.out.print("\nPlease enter your choice:  ");

            choice = input.nextInt();

            switch(choice){
                case 1: // Add home
                returnCondition = AddHome();
                    break;
                case 2: // Delete Home
                    returnCondition = RemoveHome();
                    break;
                case 3: // Update Home
                    returnCondition = UpdateHome();
                    break;
                case 4: // Print Inventory
                    returnCondition = PrintInventory();
                    break;
                case 5: // Quit
                    input.close();
                    System.out.println("Exiting Program");
                    System.exit(0);
                    break;
                default: // Invalid input
                    System.out.println("Not a valid menu option. Please try again");
                    break;
            }
        }
    }

    //Add Home
    public static String AddHome() {
        int homeSquare_feet, homeZip_code;
        String homeAddress, homeCity, homestate, homeModel_name, homesale_status;
        /*
        try {
            Get all information regarding the house
            Add information
            return("House information added");
        } catch (Exception e) {
            return("Information failed to be added");
        }
        */
    }

    //Remove Home
    public static String RemoveHome() {
        String homeModel, homeAddress;
        int homeZipCode;
        /*
        try {
            get identifying information
            search for matching informatino
            delete all data at matching area
            return("House deleted")
        } catch (Exception e) {
            return("No data to delete")
        }
        */
    }

    //Update Home
    public static String UpdateHome() {
        int homeSquare_feet, homeZip_code;
        String homeAddress, homeCity, homestate, homeModel_name, homesale_status;
        /*
        try {
            Get all information regarding the house
            Update information
            return("House information updated");
        } catch (Exception e) {
            return("Informatino not found")
        }
        */
    }

    //Print Inventory to document
    public static String PrintInventory() {
        /*
        try {
            Take all information
            move it to document. Format it
            return("Information added to " + document name)
        } catch (Exception e) {
            return("Could not upload to file")
        }
        */
    }

    //public static ? Get informatino: Get all house information from user?
}
