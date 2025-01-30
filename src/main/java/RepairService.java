/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ira
 */
public class RepairService extends SalesItem {
    private int hours;

    public RepairService(String name, double price, int hours) {
        super(name, price);
        this.hours = hours;
    }

    @Override
    public double calculateTotal() {
        return getPrice() * hours;
    }
}