import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	String menuInput = ""; // initialize to avoid error

        // initializeDogList
        initializeDogList();
        // initializeMonkeyList
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
        while (!menuInput.equalsIgnoreCase("q")) {
            //display menu inside loop
            displayMenu();
            //initiate first command
            try {
                menuInput = scanner.nextLine();
            
                //switch/case to handle finite options
                switch (menuInput) {
                    case "1":         // Intake a new dog
                    	intakeNewDog(scanner);
                        break;
                    case "2":         // Intake a new monkey;
                    	intakeNewMonkey(scanner);
                    	break;
                    
                    case "3":         // [3] Reserve an animal;
                    	reserveAnimal(scanner);
                    	break;
                    case "4":         // [4] Print a list of all dogs;
                    	printAnimals("dog");
                    	break;
                    case "5":         // [5] Print a list of all monkeys;
                        printAnimals("monkey");
                        break;
                    case "6":         // [6] Print a list of all animals that are not reserved
                    	printAnimals("available");
                    	break;
                    case "q":
                    case "Q":
                        System.out.println("Goodbye.");
                        break;
                    default:
                    	System.out.print("Invaild selection. Please try again.");
                    	break; //redundant but habitual
                } 
            }
            catch (InputMismatchException excpt) {
                System.out.print(excpt.getMessage());
            }
        }
        scanner.close(); //close scanner upon loop termination
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", false, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Bob", "male", "5", "15.2", "09-15-2020", "United States", "in service", false, "United States", 30.5, 20.3, 25.7, "Macaque");
        monkeyList.add(monkey1);
    }

    // Complete the intakeNewDog method
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        // The input validation checking dog is not already in the list
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the dog's acquisition date?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("What is the dog's acquisition country?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the dog's training status?"); // add user prompts if categorical data
        String trainingStatus = scanner.nextLine();
        System.out.println("Is the dog reserved?(true/false)");
        boolean reserved = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("What is the dog's in service country?");
        String inServiceCountry = scanner.nextLine();
        
        // Add the code to instantiate a new dog and add it to the appropriate list
        Dog dog = new Dog(name, breed, gender, age, weight, acquisitionDate,
        acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        dogList.add(dog);
        System.out.println("Dog added succesfully!");
    }

        // Complete intakeNewMonkey
    public static void intakeNewMonkey(Scanner scanner) {
    	System.out.println("What is the monkeys's name?");
        String name = scanner.nextLine();
        
        // The input validation checking monkey is not already in the list
        for(Monkey monkey: monkeyList) {
            if(monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; //returns to menu
            }
        }
        
        // input validation checking species type 
        System.out.println("What is the monkeys's species?");
        String species = scanner.nextLine();
        
        if (!species.equalsIgnoreCase("capuchin") && !species.equalsIgnoreCase("guenon")
        && !species.equalsIgnoreCase("macaque") && !species.equalsIgnoreCase("marmoset") 
        && !species.equalsIgnoreCase("squirrel monkey") && !species.equalsIgnoreCase("tamarin")){
            System.out.println("\n\nThis monkey is not one of the species that is elligible to train.\n\n");
            return; //returns to menu
        }
        
        System.out.println("What is the monkey's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the monkey's age?");
        String age = scanner.nextLine();
        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the monkey's acquisition date?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("What is the monkey's acquisition country?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the monkey's training status? (Intake, Phase I-V, in service, or farm)");
        String trainingStatus = scanner.nextLine();
        System.out.println("Is the monkey reserved?(true/false)");
        boolean reserved = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("What is the monkey's in service country?");
        String inServiceCountry = scanner.nextLine();
        System.out.println("What is the monkey's tail length?");
        Double tailLength = scanner.nextDouble();
        System.out.println("What is the monkey's height?");
        Double height = scanner.nextDouble();
        System.out.println("What is the monkey's body length?");
        Double bodyLength = scanner.nextDouble();
        scanner.nextLine(); // clear input field

        Monkey monkey = new Monkey(name, gender, age, weight, acquisitionDate,
        	    acquisitionCountry, trainingStatus, reserved, inServiceCountry, 
        	    tailLength, height, bodyLength, species);
        monkeyList.add(monkey);
        
        System.out.println("Monkey added successfully!");
    }

        // Complete reserveAnimal
        // Be sure to use getters / setters to check and set the desired animal. Try not to refer to the variables directly.
    public static void reserveAnimal(Scanner scanner) {
        String desiredAnimalType;
        String desiredServiceCountry;
        
        // find animal type using getters
        System.out.println("What kind of animal would you like to reserve?");
      	// temp store animal type
      	desiredAnimalType = scanner.nextLine().trim().toLowerCase();
      	
      	//input validation
      	while (!desiredAnimalType.equalsIgnoreCase("dog") && !desiredAnimalType.equalsIgnoreCase("monkey")) {
          System.out.println("Invalid animal type. Please choose dog or monkey.");
          desiredAnimalType = scanner.nextLine().trim().toLowerCase();
        }
      
      	// prompt user for desired service country
        System.out.println("What is the desired service country for the animal?");
        // temp storage of user input
        desiredServiceCountry = scanner.nextLine().trim().toLowerCase();

      	// switch case for options: dog, monkey, or invalid
      	
      	switch (desiredAnimalType.toLowerCase()){
        	case "dog": // to reserve a dog
                for(Dog dog: dogList) {
                    // filter using getTrainingStatus = in service, getReserved (boolean type), and getInService Country = desiredService Country
                    if((dog.getReserved() == false) &&  (dog.getInServiceCountry().equalsIgnoreCase(desiredServiceCountry)) && (dog.getTrainingStatus().equalsIgnoreCase("in service"))) {
                        // reserve the dog that meets criteria
                        dog.setReserved(true) ;
                        // print dog's information
                        printAnimals("dog");
                        break;
                    }
                    // invalid input response
                    else {
                        System.out.println("Sorry! No such dog available to reserve.");
                    }
                }
                break;
            case "monkey": // to reserve a monkey
                for (Monkey monkey: monkeyList) {
                    // filter using getTrainingStatus = in service, getReserved (boolean type), and getInService Country = desiredService Country
                    if ((monkey.getReserved() == false) &&  (monkey.getInServiceCountry().equalsIgnoreCase(desiredServiceCountry)) && (monkey.getTrainingStatus().equalsIgnoreCase("in service"))) {
                    // reserve the monkey that meets criteria
                    monkey.setReserved(true);
                    // print monkey's information
                    printAnimals("monkey");
                    break;
                    }
                    else {
                        System.out.println("Sorry! No such monkey available to reserve.");
                    }
                }
                break;
      	}
    }
        
    // Complete printAnimals
    // instructions from sense: A method to display a list of all of the specified animal types (dogs, monkeys, or all animals) 
    // that are “in service“ and available (not “reserved“)
    public static void printAnimals(String listType) {
		
		//switch based on listType
		switch (listType) {
		    // case dog: prints the list of dogs
		    case "dog":
		        // Include the animal name, status, acquisition country and if the animal is reserved.
		        for (Dog dog : dogList) {
		            System.out.println("Dog name: " + dog.getName());
		            System.out.println("Dog status: " + dog.getTrainingStatus());
		            System.out.println("Acquisition Country: " + dog.getAcquisitionLocation());
		            System.out.println("Reserved?: " + dog.getReserved());
		            System.out.println();
		        }
		        break;
	        // case monkey: prints the list of monkeys
	        case "monkey":
	            // Include the animal name, status, acquisition country and if the animal is reserved.
	            for (Monkey monkey : monkeyList) {
		            System.out.println("Monkey name: " + monkey.getName());
		            System.out.println("Moneky status: " + monkey.getTrainingStatus());
		            System.out.println("Acquisition Country: " + monkey.getAcquisitionLocation());
		            System.out.println("Reserved?: " + monkey.getReserved());
		            System.out.println();
	            }
	            break;
            // case available: prints a combined list of all animals that are "in service" %% !reserved  
            case "available": 
                // print available dogs
		        for (Dog dog : dogList) {
		            // check if "in service" %% !reserved
		            if ((dog.getTrainingStatus().equalsIgnoreCase("in service")) && (dog.getReserved() == false)) {
		                // Include the animal name, status, acquisition country and if the animal is reserved.
		                System.out.println("Dog name: " + dog.getName());
		                System.out.println("Dog status: " + dog.getTrainingStatus());
		                System.out.println("Acquisition Country: " + dog.getAcquisitionLocation());
		                System.out.println("Reserved?: " + dog.getReserved());
		                System.out.println();
		            }
	            }
	            //print avaiable monkeys
	            for (Monkey monkey : monkeyList) {
		            // check if "in service" %% !reserved
		            if ((monkey.getTrainingStatus().equalsIgnoreCase("in service")) && (monkey.getReserved() == false)) {
		                // Include the animal name, status, acquisition country and if the animal is reserved.
		                System.out.println("Monkey name: " + monkey.getName());
		                System.out.println("Monkey status: " + monkey.getTrainingStatus());
		                System.out.println("Acquisition Country: " + monkey.getAcquisitionLocation());
		                System.out.println("Reserved?: " + monkey.getReserved());
		                System.out.println();
		            }
	            }
	            break;
		    }
    }  
}