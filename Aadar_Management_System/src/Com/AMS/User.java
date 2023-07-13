package Com.AMS;

import java.util.Scanner;

public class User {
	private String username;
	private String userdob;
	private String usergender;
	private String useraddress;
	private String usernationality;
	private String userfathers_name;
	private String usermothers_name;
	private String usercontact_number;
	private String useremail;
	
	
	public User() {
		
	}
	
	// Parameterized constructor
	public User(String name, String dob, String gender, String address, String nationality, String fathers_name,
			String mothers_name, String contact_number, String email) {
		super();
		this.username = name;
		this.userdob = dob;
		this.usergender = gender;
		this.useraddress = address;
		this.usernationality = nationality;
		this.userfathers_name = fathers_name;
		this.usermothers_name = mothers_name;
		this.usercontact_number = contact_number;
		this.useremail = email;
	}

	public String getName() {
		return username;
	}

	public void setName(String name) {
		this.username = name;
	}

	public String getDob() {
		return userdob;
	}

	public void setDob(String dob) {
		this.userdob = dob;
	}

	public String getGender() {
		return usergender;
	}

	public void setGender(String gender) {
		this.usergender = gender;
	}

	public String getAddress() {
		return useraddress;
	}

	public void setAddress(String address) {
		this.useraddress = address;
	}

	public String getNationality() {
		return usernationality;
	}

	public void setNationality(String nationality) {
		this.usernationality = nationality;
	}

	public String getFathers_name() {
		return userfathers_name;
	}

	public void setFathers_name(String fathers_name) {
		this.userfathers_name = fathers_name;
	}

	public String getMothers_name() {
		return usermothers_name;
	}

	public void setMothers_name(String mothers_name) {
		this.usermothers_name = mothers_name;
	}

	public String getContact_number() {
		return usercontact_number;
	}

	public void setContact_number(String contact_number) {
		this.usercontact_number = contact_number;
	}

	public String getEmail() {
		return useremail;
	}

	public void setEmail(String email) {
		this.useremail = email;
	}

	@Override
	public String toString() {
		return "Applicant [name=" + username + ", dob=" + userdob + ", gender=" + usergender + ", address=" + useraddress
				+ ", nationality=" + usernationality + ", fathers_name=" + userfathers_name + ", mothers_name=" + usermothers_name
				+ ", contact_number=" + usercontact_number + ", email=" + useremail + "]";
	}

	public void applicantDetails() {
		Scanner UI = new Scanner(System.in);

		while (true) {
			System.out.print("Enter name: ");
			username = UI.nextLine();
			if (username.matches("[a-zA-Z ]+")) {
				break;
			} else {
				System.out.println("Invalid name. Please enter alphabets and spaces only.");
			}
		}

		while (true) {
			System.out.print("Enter date of birth (dd/mm/yyyy): ");
			userdob = UI.nextLine();
			if (userdob.matches("\\d{2}/\\d{2}/\\d{4}")) {
				break;
			} else {
				System.out.println("Invalid date of birth format. Please enter in dd/mm/yyyy format.");
			}
		}

		while (true) {
			System.out.print("Enter gender (M/F/O): ");
			usergender = UI.nextLine();
			if (usergender.matches("[MmFfOo]")) {
				break;
			} else {
				System.out.println("Invalid gender. Please enter M, F, or O.");
			}
		}

		System.out.print("Enter address: ");
		useraddress = UI.nextLine();
		
		while (true) {
			System.out.print("Enter nationality : ");
			usernationality = UI.nextLine();
			if (usernationality.equalsIgnoreCase("indian")) {
				break;
			} else {
				System.out.println("Only Indian nationality is allowed.");
			}
		}

		while (true) {
			System.out.print("Enter father's name: ");
			userfathers_name = UI.nextLine();
			if (userfathers_name.matches("[a-zA-Z ]+")) {
				break;
			} else {
				System.out.println("Invalid father's name. Please enter alphabets and spaces only.");
			}
		}

		while (true) {
			System.out.print("Enter mother's name: ");
			usermothers_name = UI.nextLine();
			if (usermothers_name.matches("[a-zA-Z ]+")) {
				break;
			} else {
				System.out.println("Invalid mother's name. Please enter alphabets and spaces only.");
			}
		}

		while (true) {
			System.out.print("Enter contact number: ");
			usercontact_number = UI.nextLine();
			if (usercontact_number.matches("\\d{10}")) {
				break;
			} else {
				System.out.println("Invalid contact number. Please enter a 10-digit numeric value.");
			}
		}

		while (true) {
			System.out.print("Enter email: ");
			useremail = UI.nextLine();
			if (useremail.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
				break;
			} else {
				System.out.println("Invalid email address. Please enter a valid email.");
			}
		}
		
}
}
