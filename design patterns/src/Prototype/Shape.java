/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author fa20-bse-025
 */
import java.util.Objects;


public abstract class Shape implements Cloneable{
    private String id;
   protected String type;
   
   abstract void draw();
   
   public String getType(){
      return type;
   }
   
   public String getId() {
      return id;
   }
   
   public void setId(String id) {
      this.id = id;
   }
   
   public Object clone() {
      Object clone = null;
      
      try {
         clone = super.clone();
         
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
      
      return clone;
   }
   public boolean equals(Shape a, Shape b) {
        // Compare shapes based on their type and id
        return Objects.equals(a.getType(), b.getType()) && Objects.equals(a.getId(), b.getId());
    }
}