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
public class InterpreterPatternDemo {

  public static void main(String[] args) {
    Expression isMale = getMaleExpression();
    Expression isMarriedWoman = getMarriedWomanExpression();
    Expression isStuartSonOfRobert = new SonExpression("Robert", "Stuart");
    Expression isSamanthaDaughterOfJulie = new DaughterExpression("Julie", "Samantha");

    System.out.println("John is male? " + isMale.interpret("John"));
    System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    System.out.println("Stuart is a son of Robert? " + isStuartSonOfRobert.interpret("Stuart is a son of Robert"));
    System.out.println("Samantha is a daughter of Julie? " + isSamanthaDaughterOfJulie.interpret("Samantha is the daughter of Julie"));
  }

  public static Expression getMaleExpression() {
    Expression robert = new TerminalExpression("Robert");
    Expression john = new TerminalExpression("John");
    return new OrExpression(robert, john);
  }

  public static Expression getMarriedWomanExpression() {
    Expression julie = new TerminalExpression("Julie");
    Expression married = new TerminalExpression("Married");
    return new AndExpression(julie, married);
  }

}
