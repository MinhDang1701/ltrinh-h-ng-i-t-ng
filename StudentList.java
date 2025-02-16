package Bai1Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    ArrayList<Student> studentList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void enterStudentInfo() {
        System.out.print("nhap sl sv: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nh in4 sv " + (i + 1) + ":");
            Student student = new Student();
            student.enterStudentInfo(scanner);
            studentList.add(student);
        }
    }

    public void displayAllStudents() {
        System.out.println("ds :");
        for (Student student : studentList) {
            student.displayStudentInfo();
        }
    }

    public void processStudents() {
        enterStudentInfo();
        displayAllStudents();
        
        System.out.print("Nh id can tim: ");
        String idToFind = scanner.nextLine();
        Student foundStudent = findStudentById(idToFind);
        if (foundStudent != null) {
            foundStudent.displayStudentInfo();
        } else {
            System.out.println("Kh tim thay ");
        }

        System.out.print("Nh iD can sua: ");
        String idToEdit = scanner.nextLine();
        editStudentById(idToEdit);
        
        System.out.print("Nh id can xoa: ");
        String idToDelete = scanner.nextLine();
        deleteStudentById(idToDelete);
    }

    private Student findStudentById(String id) {
        for (Student student : studentList) {
            if (student.studentId.equals(id)) {
                return student;
            }
        }
        return null;
    }

    private void editStudentById(String idToEdit) {
        Student student = findStudentById(idToEdit);
        if (student != null) {
            System.out.println("Nh new in4:");
            student.enterStudentInfo(scanner);
        }
    }

    private void deleteStudentById(String idToDelete) {
        Student student = findStudentById(idToDelete);
        if (student != null) {
            studentList.remove(student);
            System.out.println("delete");
        } else {
            System.out.println("ko thay");
        }
    }
}