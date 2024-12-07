package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// Constructor: prompt user to enter student name and year
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first name :");
		this.firstName = sc.nextLine();

		System.out.print("Enter your last name :");
		this.lastName = sc.nextLine();

		System.out.print("1-Freshman\n2-Sophmore\n3-Junior\n4-Senior\nEnter your class level :");
		this.gradeYear = sc.nextInt();
		setStudentId();

	}

	// Generate id
	private void setStudentId() {
		id++;
		this.studentId = gradeYear + "" + id;
	}

	// Enroll in courses
	public void enroll() {
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tuitionBalance = tuitionBalance + costOfCourse;

			} else {
				break;
			}
		} while (1 != 0);
	}

	// View Balance
	public void viewBalance() {
		System.out.println("Your Balance is: $" + tuitionBalance);
	}

	// Pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment : $");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment : $" + payment);
		viewBalance();
	}

	// Show status
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nGrade Level: "+  gradeYear+
				"\nStudent Id: "+studentId +
				"\nCourses Enrolled: " + courses +
				"\nBalance:" + tuitionBalance;

	}
}
