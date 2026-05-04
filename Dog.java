
public class Dog extends RescueAnimal {

    // Instance variable
    private String breed;

    // Constructor
    public Dog(String name, String breed, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
        
        // call parent constructor to initiate shared attributes
		
		super();
		// set Rescue Animal attributes
		this.setName(name);
	    this.setGender(gender);
	    this.setAge(age);
	    this.setWeight(weight);
	    this.setAcquisitionDate(acquisitionDate);
	    this.setAcquisitionLocation(acquisitionCountry);
	    this.setTrainingStatus(trainingStatus);
	    this.setReserved(reserved);
	    this.setInServiceCountry(inServiceCountry);
		this.setAnimalType("dog"); // This line ensures animalType is set.
		
		// set dog specifi attributes
		this.breed = breed;

    }

    // Accessor Method
    public String getBreed() {
        return breed;
    }

    // Mutator Method
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }

}
