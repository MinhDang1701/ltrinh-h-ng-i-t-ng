package Bai1Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String studentId;
    String fullName;
    String dateOfBirth;
    String major;
    float gpa;

    public void enterStudentInfo(Scanner scanner) {
        System.out.print("Nh ID: ");
        this.studentId = scanner.nextLine();
        System.out.print("Nh name: ");
        this.fullName = scanner.nextLine();
        System.out.print("Nh  date: ");
        this.dateOfBirth = scanner.nextLine();
        System.out.print("Nh  major: ");
        this.major = scanner.nextLine();
        System.out.print("Nh GPA: ");
        this.gpa = Float.parseFloat(scanner.nextLine());
    }

    public void displayStudentInfo() {
        System.out.println("ID: " + studentId + " | Name: " + fullName + " | Date: " + dateOfBirth +
                " | Major: " + major + " | GPA: " + gpa);
    }
}




