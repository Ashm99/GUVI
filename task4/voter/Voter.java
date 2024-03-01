package voter;

//a Voter class with a constructor, attributes, getters and setters for the attributes
public class Voter {
	private int voterId;
	private String name = "";
	private int age = 0;
	
	//parameterized constructor
	public Voter(int voterId, String name, int age) throws AgeNotValidException, InterruptedException {
		this.setVoterId(voterId);
		this.setName(name);
		this.setAge(age);
	}

	//return the voterId
	public int getVoterId() {
		return voterId;
	}

	//return the name
	public String getName() {
		return name;
	}

	//return the age
	public int getAge() {
		return age;
	}

	//set the rollNo
	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}

	//sets the name
	public void setName(String name){
		this.name = name;
	}

	//set the age
	//step 1. if the given age is not acceptable, throws error, handles the error and prints the error message
	//step 2. Afterwards, receives new input from the user and uses it, if acceptable
	//if not, then from step 1 again
	public void setAge(int age) throws InterruptedException{
		try {
			this.age = age;
			if(age < 18) {
				throw new AgeNotValidException("Invalid age for voter!");
			}
			
		}
		catch(AgeNotValidException e) {
			System.err.println(e.getMessage());
			Thread.sleep(10);
			this.displayData();
			System.out.println();
		}
	}

	//prints the voter's name, age and id
	public void displayData() {
		System.out.println("Voter ID: " + this.voterId 
		               + "\nAge     : " + this.age 
		               + "\nName    : " + this.name);
	}
}
