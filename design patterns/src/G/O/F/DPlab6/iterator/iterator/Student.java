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
public class Student {
    private String name;
    private int age;
    private String regNo;
    private double cgpa;

    public Student(String name, int age, String regNo, double cgpa) {
        this.name = name;
        this.age = age;
        this.regNo = regNo;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRegNo() {
        return regNo;
    }

    public double getCGPA() {
        return cgpa;
    }
    
    
}



