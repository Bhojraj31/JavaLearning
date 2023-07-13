package Com.AMS;

public class ApnaAdhar {

	private String apnaAdharName;
	private String address;

	public ApnaAdhar() {

	}

	// Parameterized constructor​
	public ApnaAdhar(String apnaAdharName, String address) {
			super();
			this.apnaAdharName = apnaAdharName;
			this.address = address;
		}

	public String getApnaAadharName() {
		return apnaAdharName;
	}

	public void setApnaAadharName(String apnaAdharName) {
		this.apnaAdharName = apnaAdharName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ApnaAadhar [apnaAdharName=" + apnaAdharName + ", address=" + address + "]";
	}

}
