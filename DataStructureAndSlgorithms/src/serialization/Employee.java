package serialization;

import java.io.Serializable;

public class Employee implements Serializable{

	public String empName; 
	public String empAddress;
	public transient String empDOB; 
	public int empID; 
	
	public Employee() {
	
	}
	
	public Employee(String empName, String empAddress, String empDOB, int empID) {
		this.empName = empName; 
		this.empAddress = empAddress;
		this.empDOB = empDOB; 
		this.empID = empID; 
	}
	
	public String getEmpName() {
		return empName; 
	}
	public void setEmpName(String empName) {
		this.empName = empName; 
	}
	public String getEmpAddress() {
		return empAddress; 
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress; 
	}
	public String getEmpDOB() {
		return empDOB; 
	}
	public void setEmpDOB(String empDOB) {
		this.empDOB = empDOB;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
}
