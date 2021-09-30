
public class Account implements OnlineAccount, Comparable<Account> {

	private int noOfRegularMovies;
	private int noOfExclusiveMovies;
	private String ownerName;
	
	
	public int getNoOfRegularMovies() {
		return noOfRegularMovies;
	}


	public void setNoOfRegularMovies(int noOfRegularMovies) {
		this.noOfRegularMovies = noOfRegularMovies;
	}


	public int getNoOfExclusiveMovies() {
		return noOfExclusiveMovies;
	}


	public void setNoOfExclusiveMovies(int noOfExclusiveMovies) {
		this.noOfExclusiveMovies = noOfExclusiveMovies;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public Account() {}
	
	
	public Account(int noOfRegularMovies, int noOfExclusiveMovies, String ownerName) {
		this.noOfRegularMovies = noOfRegularMovies;
		this.noOfExclusiveMovies = noOfExclusiveMovies;
		this.ownerName = ownerName;
	}

	public int monthlyCost() {
		return basePrice + noOfRegularMovies * regularMoviePrice + noOfExclusiveMovies * exclusiveMoviePrice; 
	
	}

	@Override
	public int compareTo(Account o) {
		return this.monthlyCost() - o.monthlyCost() ;
	}

	@Override
	public String toString() {
		return "Owner is " + ownerName + " and monthly cost is " + monthlyCost() + " USD." ;
	}

}
