package hibernateStudy;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Family {

	@Id
	private int memberId;
	private String firstName;
	private String lastName;
	
	
	/**
	 * No argument constructor
	 */
	public Family() {
	}


	/**
	 * @param firstName
	 * @param lastName
	 */
	public Family(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	/**
	 * @return the memberId
	 */
	public int getMemberId() {
		return memberId;
	}


	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Family [memberId=" + memberId + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}
	
	
}
