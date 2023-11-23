/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author FA20-BSE-025
 */
public class Avatar extends Shape {
    private String species;

    public Avatar(String species) {
        this.species = species;
        type = "Avatar";
    }

    @Override
    public void draw() {
        System.out.println("Inside Avatar::draw() method for " + species);
    }

    // Getter for species
    public String getSpecies() {
        return species;
    }
}