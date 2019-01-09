import java.util.Date;

/* Employee class is type of User  
 *  
 * @variable : discountPer for % of Discount for Employee  
 * @varible :  discount class use to calculate discount for product
 * 
 */

public class Employee implements User {

	private int discountPer;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Employee other = (Employee) obj;
		if (discountPer != other.discountPer)
			return false;
		return true;
	}

	public Employee() {
		this.discountPer = 30;
	}
	
	public int getDiscountPer() {
		return discountPer;
	}
	public void setDiscountPer(int discountPer) {
		this.discountPer = discountPer;
	}
	

	
/*
 * 	(non-Javadoc)
 * @see User#discount()
 * 
 * Give the percent of discount as per the User type
 */
	@Override
	public int discount() {
		return discountPer;
	}
	
}

