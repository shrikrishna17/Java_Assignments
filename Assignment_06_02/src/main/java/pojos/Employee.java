package pojos;

public class Employee {
	
	private int empId;
	private String name;
	private String phone;
	private String email;
	private String address;
	private String qualification;
	private String experience;
	private String joiningDate;
	private String employmentStatus;
	private String contractEndDate;
	private String PFAccountNumber;
	public Employee() {

	}
	public Employee(int empId, String name, String phone, String email, String address, String qualification,
			String experience, String joiningDate, String employmentStatus, String contractEndDate,
			String pFAccountNumber) {
		this.empId = empId;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.qualification = qualification;
		this.experience = experience;
		this.joiningDate = joiningDate;
		this.employmentStatus = employmentStatus;
		this.contractEndDate = contractEndDate;
		this.PFAccountNumber = pFAccountNumber;
	}
	
	
	public Employee(String name, String phone, String email, String address, String qualification, String experience,
			String joiningDate, String employmentStatus, String contractEndDate, String pFAccountNumber) {
		
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.qualification = qualification;
		this.experience = experience;
		this.joiningDate = joiningDate;
		this.employmentStatus = employmentStatus;
		this.contractEndDate = contractEndDate;
		this.PFAccountNumber = pFAccountNumber;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getEmploymentStatus() {
		return employmentStatus;
	}
	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}
	public String getContractEndDate() {
		return contractEndDate;
	}
	public void setContractEndDate(String contractEndDate) {
		this.contractEndDate = contractEndDate;
	}
	public String getPFAccountNumber() {
		return PFAccountNumber;
	}
	public void setPFAccountNumber(String pFAccountNumber) {
		PFAccountNumber = pFAccountNumber;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", phone=" + phone + ", email=" + email + ", address="
				+ address + ", qualification=" + qualification + ", experience=" + experience + ", joiningDate="
				+ joiningDate + ", employmentStatus=" + employmentStatus + ", contractEndDate=" + contractEndDate
				+ ", PFAccountNumber=" + PFAccountNumber + "]";
	}
	
	
}
