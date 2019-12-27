package studdb;

import java.util.Scanner;

public class StudDBApp {

	public static void main(String[] args) {
		
		System.out.println("Enter No# of Students to Enroll: ");
		Scanner inStud = new Scanner(System.in);
		int studCt = inStud.nextInt();
		Stud[] students = new Stud[studCt];
		
		for(int i = 0; i < studCt; i++) {
			Stud stud = new Stud();
			stud.enrollCourses();
			stud.payBalance();
			System.out.println(stud.showInfo());
//			stud.showInfo();
		}
		
	}

}
