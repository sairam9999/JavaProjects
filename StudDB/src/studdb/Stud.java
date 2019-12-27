package studdb;

import java.util.Scanner;

public class Stud {

	private String fName;
	private String lName;
	private int year;
	private String studID;
	private String courseList = null;
	private int courseBalance = 0;
	private static int courseCost = 600;
	private static int id = 1000;
	
//	Constructor for a Student Class
	public Stud() {
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter the First Name of the Student: ");
		this.fName = inputScanner.nextLine();
		
		System.out.println("Enter the Last Name of the Student: ");
		this.lName = inputScanner.nextLine();
		
		System.out.println("1- Freshman\n2 - Sophmore\n3 - Senior\nEnter Student Class Level: ");
		this.year = inputScanner.nextInt();
		
		generateStudId();
		System.out.println(fName + " " + lName + " " + year + " " + studID);
		
	}
	
//	Function to generate Student ID
	
	private void generateStudId() {
		
		id++;
		this.studID = year + "" + id;
		
	}
	
//	Function to Enroll in Courses
	
	public void enrollCourses() {
		
		do {
			System.out.println("Enter Course to Enroll (Q to Quit)");
			Scanner inCourses = new Scanner(System.in);
			String selCourses = inCourses.nextLine();
			if(!selCourses.equals("Q")) {
				courseList = courseList + "\n" + selCourses;
				courseBalance = courseBalance + courseCost;
			}
			else {
				break;
			}
		}
		while(1 != 0);	
		
		System.out.println("Enrolled In: " + courseList);
		System.out.println("Course Balance: " + courseBalance);
	}
	
//	View Balance
	
	public void viewBalance() {
		System.out.println("Total Balance: " + courseBalance);
	}
	
//	Pay Tution
	
	public void payBalance() {	// Payment: Amount from the user
		viewBalance();
		System.out.println("Enter the Payment: ");
		Scanner inPaymnet = new Scanner(System.in);
		int payment = inPaymnet.nextInt();
		courseBalance = courseBalance - payment;
		viewBalance();
	}
	
	public String showInfo() {
		return "Name:" + fName + " " + lName +
				"\nCourses Enrolled: " + courseList +
				"\nYour Balance: " + courseBalance;
	}
	
}
