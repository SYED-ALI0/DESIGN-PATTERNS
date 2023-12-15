/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interpreter;

/**
 *
 * @author fa20-bse-025
 */
public class DaughterExpression implements Expression {

  private Expression mother;
  private Expression daughter;

  public DaughterExpression(String mother, String daughter) {
    this.mother = new TerminalExpression(mother);
    this.daughter = new TerminalExpression(daughter);
  }

  @Override
  public boolean interpret(String context) {
    return context.contains(mother.interpret(context) + " daughter of " + daughter.interpret(context));
  }

}