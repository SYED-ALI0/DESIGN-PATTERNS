/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G.O.F.DPlab6.iterator.iterator;

/**
 *
 * @author fa20-bse-025
 */
public class StudentDetailsDemo {
    public static void main(String[] args) {
        
    Object[][] studentsData = {
    {"Alice", 20, "REG001", 3.8},
    {"Bob", 22, "REG002", 3.5},
    {"Charlie", 21, "REG003", 3.7},
    {"David", 23, "REG004", 3.9}
  }; 
        Student[][] students = new Student[studentsData.length][];
        
        for (int i = 0; i < studentsData.length; i++) {
            students[i] = new Student[studentsData[i].length];
            for (int j = 0; j < studentsData[i].length; j++) {
                Object[] studentInfo = (Object[]) studentsData[i];
                students[i][j] = new Student(
                    (String) studentInfo[0],
                    (int) studentInfo[1],
                    (String) studentInfo[2],
                    (double) studentInfo[3]
                );
            }
        }

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                Student student = students[i][j];
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Registration No: " + student.getRegNo());
                System.out.println("CGPA: " + student.getCGPA());
                System.out.println();
            }
        }
    }
}
