package javabeans;

import java.io.Serializable;



public class JavaBeans implements Serializable {
	
	private int Id;
	private String firstName;
	private String lastName;
	
	
	
	/**
	 * No argument constructor function
	 */
	public JavaBeans() {
	}



	/**
	 * @return the id
	 */
	public int getId() {// Getters and setters for the instances of the Javabeans class
		return Id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
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
	
	
	

}
