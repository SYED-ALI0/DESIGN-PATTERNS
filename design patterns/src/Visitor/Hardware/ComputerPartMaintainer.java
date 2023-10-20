/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Visitor.Hardware;

/**
 *
 * @author fa20-bse-025
 */
public interface ComputerPartMaintainer {
    void maintain(Computer computer);
    void maintain(Mouse mouse);
    void maintain(Keyboard keyboard);
    void maintain(Monitor monitor);
    void maintain(Multimedia multimedia);
}
