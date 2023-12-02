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
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg", "secretCode");

        // Image will be loaded from disk
        image.display(true);
        System.out.println("");

        // Image will not be loaded from disk
        image.display(false);
    }
}