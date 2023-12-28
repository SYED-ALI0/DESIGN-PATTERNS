/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final;

/**
 *
 * @author syed
 */
import Final.AdmissionSystemBuilder;
import Final.ConcreteAdmissionSystemBuilder;

import Final.AdmissionSystemSubject;
import java.util.ArrayList;
import java.util.List;

import Final.AdmissionIterator;
import Final.ConcreteAdmissionIterator;

public class AdmissionSystemMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Build the Admission System using the Builder pattern
        AdmissionSystemBuilder builder = new ConcreteAdmissionSystemBuilder();
        builder.buildSubject();
        builder.buildObservers();
        builder.buildStrategies();
        builder.buildSubsystems();

        // Get the constructed Admission System
        AdmissionSystemSubject admissionSystem = builder.getResult();

        // Use the Iterator pattern to iterate over Admission System subjects
        List<AdmissionSystemSubject> admissionList = new ArrayList<>();
        admissionList.add(admissionSystem);
        AdmissionIterator iterator = new ConcreteAdmissionIterator(admissionList);

        while (iterator.hasNext()) {
            AdmissionSystemSubject subject = (AdmissionSystemSubject) iterator.next();
            // Process each Admission System subject
        }
    }
    
}