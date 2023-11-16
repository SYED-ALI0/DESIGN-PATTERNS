
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author syed
 */
class ConcreteIterator implements Iterator {
    private int index;
    private List<LabComputer> computerList;

    public ConcreteIterator(List<LabComputer> computers) {
        this.index = 0;
        this.computerList = computers;
    }

    @Override
    public boolean hasNext() {
        return index < computerList.size();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return computerList.get(index++);
        }
        return null; // or throw NoSuchElementException
    }
}
