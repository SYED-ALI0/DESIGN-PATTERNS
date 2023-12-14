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
public class SonExpression implements Expression {

  private Expression father;
  private Expression son;

  public SonExpression(String father, String son) {
    this.father = new TerminalExpression(father);
    this.son = new TerminalExpression(son);
  }

  @Override
  public boolean interpret(String context) {
    return context.contains(father.interpret(context) + " son of " + son.interpret(context));
  }

}