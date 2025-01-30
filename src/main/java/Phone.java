/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ira
 */
public class Phone extends SalesItem {
    private int quantitySold;

    public Phone(String name, double price, int quantitySold) {
        super(name, price);
        this.quantitySold = quantitySold;
    }

    @Override
    public double calculateTotal() {
        return getPrice() * quantitySold;
    }
}