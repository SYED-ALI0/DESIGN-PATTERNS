/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final;

/**
 *
 * @author syed
 */
public class StudentObserver implements AdmissionObserver {
    @Override
    public void update() {
        System.out.println("StudentObserver: Notification received");
        // Update logic for students
    }
}