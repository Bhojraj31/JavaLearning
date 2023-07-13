package Com.AMS__Main;

//import Required Java Packages
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// import All Class
import Com.AMS.ApnaAdhar;
import Com.AMS.Details;
import Com.AMS.User;


public class MainClass {
	static User user = new User();
    static ApnaAdhar apnaAdhar = new ApnaAdhar();
    static List<Details> DetailsList = new ArrayList<>();

    public static void main(String[] args){
		
		Scanner UI = new Scanner(System.in);
        System.out.println("** Welcome to Apna Aadhar **");
        System.out.println("Please Enter your user id and password");
        System.out.print("Enter your userId*:");
        String userId = UI.next();
        System.out.print("Enter your Password*:");
        String password = UI.next();
        
        String userIdRegex = "^Bhojraj3108$";
        String passwordRegex = "^Bhojraj@31$";
        
        if (userId.matches(userIdRegex) && password.matches(passwordRegex)) {
            System.out.println("** Welcome to your Apna Aadhar 😊 **");
            System.out.println("Please Fill the required details* ");

            List<User> applicants = new ArrayList<>();

            boolean addMoreApplicants = true;
            while (addMoreApplicants) {
            	User applicant = new User();
                applicant.applicantDetails();
                applicants.add(applicant);

                System.out.println("Do you want to add details for another User? (Yes, No)");
                String choice = UI.next();
                if (choice.equalsIgnoreCase("No")) {
                    addMoreApplicants = false;
                }
            }

            System.out.println("Your application(s) have been submitted successfully.");
            System.out.println("The details provided by you are as follows:");

            // Print the details of all applicants and generate ApnaAadhaar Details
            for (User app : applicants) {
                System.out.println(app);
                
                System.out.println("To check your aadhar details preess 1 else press 2");
                Details aadhaarDetails = createAadhaarDetails(app);
                DetailsList.add(aadhaarDetails);
                int num=UI.nextInt();
                if(num==1) {
                	System.out.println("Your Aadharcard has been genrated sucessfully the details are:");
                	
                	// Print all ApnaAadhaar Details
                    System.out.println("All Aadhaar Details:");
                    printAllAadhaarDetails();
                }else {
                	System.out.println("Thank you 💖");
                }
            }

           
        } else {
            System.out.println("Invalid user id or password");
        }
	}
	
	private static Details createAadhaarDetails(User applicant) {
        Details aadhaarDetails = new Details();
        aadhaarDetails.setAadharNumber(generateAadharNumber());
        aadhaarDetails.setName(applicant.getName());
        aadhaarDetails.setDob(applicant.getDob());
        return aadhaarDetails;
    }

    private static String generateAadharNumber() {
    	long aadharNumber = (long) (Math.random() * 9_000_000_000_000_000L) + 1_000_000_000_000_000L;
        return String.valueOf(aadharNumber);
    }

    private static void printAllAadhaarDetails() {
        for (Details aadhaarDetails : DetailsList) {
            System.out.println(aadhaarDetails);
        }
    }
    
}
