package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance;
	private static int costOfCourse = 600; //something thats not true to an object but is something that is true for all objects
	private static int id = 1000; //it belongs to the class not instance of the object

	//Constructor: prompt the user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();

		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();

		System.out.print("1 - FRESHMAN\n2 - SOPHOMORE\n3 - JUNIOR\n4 - SENIOR\nEnter student class level: ");
		this.gradeYear = in.nextInt();

		setstudentID();
		



	}

	//Generate an ID
	private void setstudentID() {
		//Grade Level +ID
		id++;
		this.studentID = gradeYear + "" + id;
	}


	//Enroll in courses
	public void enroll() {
		//Get inside a loop, user hits 0
	do {	
		System.out.print("Enter course to enroll (Q to quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();

		if(!course.equals("Q")) {
			courses = courses + "\n " + course;
			tuitionBalance = tuitionBalance + costOfCourse;
		} else {
			break;
		}
		
	} while(1 != 0);
	}
	//View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}

	//Pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}


	//Show status
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nGrade Level: " + gradeYear +
				"\nStudentID: " + studentID +
				"\nCourses Enrolled:" + courses +
				"\nBalance: $" + tuitionBalance;
	}
}
