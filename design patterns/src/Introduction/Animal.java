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
class  Animal  {
    private String name;
    private  double averageWeight;
    private  int numberOfLegs;

    // Getter methods
    public String getName()  {
        return name;
    }
    public  double  getAverageWeight()  {
        return averageWeight;
    }
    public  int  getNumberOfLegs()  {
        return numberOfLegs;
    }
    // Setter methods
    public  void  setName(String name)  {
        this.name  = name;
    }
    public  void  setAverageWeight(double averageWeight)  {
        this.averageWeight  = averageWeight;
    }
    public  void  setNumberOfLegs(int numberOfLegs)  {
        this.numberOfLegs  = numberOfLegs;
    }
}
