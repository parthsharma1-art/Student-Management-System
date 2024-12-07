package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {

		// Ask how many new student we want to add
		System.out.print("Enter number of student to enroll :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Student[] students = new Student[n];

		// Create a number of student
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Details of Student "+ (i+1)+" :");
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			

		}
		for(int i=0;i<n;i++) {
			System.out.println(students[i].toString());
		}

	}

}
