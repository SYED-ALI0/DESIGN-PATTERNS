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
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;
    private String displayCode;

    public ProxyImage(String fileName, String displayCode) {
        this.fileName = fileName;
        this.displayCode = displayCode;
    }

    @Override
    public void display(boolean showRealImage) {
        if (showRealImage || displayCode != null && displayCode.equals("secretCode")) {
            if (realImage == null) {
                realImage = new RealImage(fileName);
            }
            realImage.display();
        } else {
            System.out.println("Displaying placeholder image for " + fileName);
        }
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
