/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author fa20-bse-025
 */
public class RealImage implements Image {

    private String fileName;
    private long fileSize;

    public
 
RealImage(String fileName)
 
{
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override

    
public
 
void
 
display()
 
{
        System.out.println("Displaying " + fileName + " (size: " + fileSize + " bytes)");
    }

    private void loadFromDisk(String fileName) {
        // Simulate loading an image from disk
        System.out.println("Loading " + fileName);
        fileSize = 10485760; // 10 MB
    }

    @Override
    public void display(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
