/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introduction;

/**
 *
 * @author FA20-BSE-025
 */
class  TestAnimal  {
    public  static  void  main(String[] args)  {
        Animal myAnimal =  new Animal();
        myAnimal.setName("Eagle");
        myAnimal.setAverageWeight(1.5);
        myAnimal.setNumberOfLegs(2);
        System.out.println("Name: "  + myAnimal.getName());
        System.out.println("Average weight: "  + myAnimal.getAverageWeight()  +  "kg");
        System.out.println("Number of legs: "  + myAnimal.getNumberOfLegs());
    }
}
