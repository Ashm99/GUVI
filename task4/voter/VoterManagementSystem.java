package voter;

public class VoterManagementSystem {

	public static void main(String[] args) throws AgeNotValidException, InterruptedException {
		
		//creating a Voter array
		Voter[] voters = new Voter[5];
		//During initialization, if the Voter's age is invalid, 
		//throws error, handles the error and prints that Voter data.
		voters[0] = new Voter(12341, "Aashiq", 17);
		voters[1] = new Voter(12342, "Pathaan", 24);
		voters[2] = new Voter(12343, "Sakthi", 16);
		voters[3] = new Voter(12344, "Prakash", 19);
		voters[4] = new Voter(12345, "Sakshi", 20);
		
		
		System.out.println("\nPrinting data of all voters: ");
		for(int i = 0; i < 5; i++) {
			voters[i].displayData();
			printline();
		}
		
	}
	static void printline() {
		System.out.println("--------------------");
	}

}
