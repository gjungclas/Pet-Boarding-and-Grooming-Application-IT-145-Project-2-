public class Monkey extends RescueAnimal {
	//instance variable
	private Double tailLength;
	private Double height;
	private Double bodyLength;
	private String species;
	
	// empty constructor
	public Monkey () {
	}
	
    // Constructor
	public Monkey(String name, String gender, String age, 
				  String weight, String acquisitionDate, String acquisitionCountry, 
				  String trainingStatus, boolean reserved, String inServiceCountry, 
				  Double tailLength, Double height, Double bodyLength, String species) {
		
		// call parent constructor to initiate shared attributes
		super();
		// set Rescue Animal attributes
		this.setName(name);
	    this.setAnimalType("monkey");
	    this.setGender(gender);
	    this.setAge(age);
	    this.setWeight(weight);
	    this.setAcquisitionDate(acquisitionDate);
	    this.setAcquisitionLocation(acquisitionCountry);
	    this.setTrainingStatus(trainingStatus);
	    this.setReserved(reserved);
	    this.setInServiceCountry(inServiceCountry);
		
		// Set the monkey-specific attributes
		this.tailLength = tailLength;
		this.height = height;
		this.bodyLength = bodyLength;
		this.species = species;
	}
	
	// getter
	public Double getTailLength() {
		return tailLength;
	}
	// setter
	public void setTailLength(Double tailLength) {
		this.tailLength = tailLength;
	}
	
	// getter
	public Double getHeight() {
		return height;
	}
	// setter
	public void setHeight(Double height) {
		this.height = height;
	}
	
	// getter
	public Double getBodyLength() {
		return bodyLength;
	}
	// setter
	public void setBodyLength(Double bodyLength) {
		this.bodyLength = bodyLength;
	}
	
	//getter
	public String getSpecies() {
		return species;
	}
	// setter
	public void setSpecies(String species) {
		this.species = species;
	}
}