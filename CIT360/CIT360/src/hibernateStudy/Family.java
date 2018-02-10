package hibernateStudy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Family {
	
	private int employeeId;
	private String empFirstname;
	private String empLastname;
	
	
	
	
	/**
	 * @return the employeeId
	 */
	@Id
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the empFirstname
	 */
	public String getEmpFirstname() {
		return empFirstname;
	}
	/**
	 * @param empFirstname the empFirstname to set
	 */
	public void setEmpFirstname(String empFirstname) {
		this.empFirstname = empFirstname;
	}
	/**
	 * @return the empLastname
	 */
	public String getEmpLastname() {
		return empLastname;
	}
	/**
	 * @param empLastname the empLastname to set
	 */
	public void setEmpLastname(String empLastname) {
		this.empLastname = empLastname;
	}
	
	

}
