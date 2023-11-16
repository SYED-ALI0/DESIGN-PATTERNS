
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author syed
 */
class ComputerList {
    private List<LabComputer> computers;
    private Iterator iterator;
    private AllocationStrategy strategy;

    public ComputerList() {
        this.computers = new ArrayList<>();
        this.iterator = new ConcreteIterator(computers);
    }

    public void addComputer(LabComputer computer) {
        computers.add(computer);
    }

    public List<LabComputer> getComputers() {
        return computers;
    }

    public void setStrategy(AllocationStrategy strategy) {
        this.strategy = strategy;
    }

    public void performStrategy() {
        if (strategy != null) {
            strategy.allocateComputers(this);
        } else {
            System.out.println("No strategy set.");
        }
    }
}
