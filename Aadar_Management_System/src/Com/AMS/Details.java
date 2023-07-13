package Com.AMS;

public class Details {
	private String userAadharNumber;
	private String userName;
	private String userDob;
	
	public Details() {
		// TODO Auto-generated constructor stub
	}
	
	public Details(String aadharNumber, String name, String dob) {
		super();
		this.userAadharNumber = aadharNumber;
		this.userName = name;
		this.userDob = dob;
	}
	
	public String getAadharNumber() {
		return userAadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.userAadharNumber = aadharNumber;
	}

	public String getName() {
		return userName;
	}

	public void setName(String name) {
		this.userName = name;
	}

	public String getDob() {
		return userDob;
	}

	public void setDob(String dob) {
		this.userDob = dob;
	}

	@Override
	public String toString() {
		return "AadhaarDetails [aadharNumber=" + userAadharNumber + ", name=" + userName + ", dob=" + userDob + "]";
	}
}	
