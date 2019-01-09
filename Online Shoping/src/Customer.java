import java.util.Date;

/* Employee class is type of User  
 *  
 * @variable : associatePeriod is time duration of customer associated with Shopping  
 * @varible :  discount class use to calculate discount for product
 * 
 */

public class Customer implements User {

	private int associatePeriod;
	private int discountPer;

	public int getDiscountPer() {
		return discountPer;
	}
	public void setDiscountPer(int discountPer) {
		this.discountPer = discountPer;
	}
	public Customer() {
	}
	public Customer(int experience) {
		this.associatePeriod= experience;
		this.discountPer=5;
	}
	
	public int getExperince() {
		return associatePeriod;
	}

	public void setExperince(int experince) {
		this.associatePeriod = experince;
	}
	

	/*
	 * 	(non-Javadoc)
	 * @see User#discount()
	 * 
	 * Give the percent of discount as per the User type
	 */	
	
	@Override
	public int discount() {
		if(associatePeriod>=2)
		return discountPer;
		else return 0;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + associatePeriod;
		result = prime * result + discountPer;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (associatePeriod != other.associatePeriod)
			return false;
		if (discountPer != other.discountPer)
			return false;
		return true;
	}
	
	
}
