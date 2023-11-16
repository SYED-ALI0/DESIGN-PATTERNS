/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author syed
 */

    public class Main {
    public static void main(String[] args) {
        // Create some students and lab computers
        Student student1 = new Student("Ali", "123", "Computer Science", 1);
        Student student2 = new Student("Ahmed", "456", "Physics", 2);

        LabComputer computer1 = new LabComputer("gcc", "Linux", "vim");
        LabComputer computer2 = new LabComputer("visual studio", "Windows", "notepad");

        // Create a computer list
        ComputerList computerList = new ComputerList();

        // Add computers to the list
        computerList.addComputer(computer1);
        computerList.addComputer(computer2);

        // Set Linux allocation strategy
        computerList.setStrategy(new LinuxAllocationStrategy());

        // Perform the strategy
        computerList.performStrategy();

        // Set Windows allocation strategy
        computerList.setStrategy(new WindowsAllocationStrategy());

        // Perform the strategy
        computerList.performStrategy();
    }
}
    

