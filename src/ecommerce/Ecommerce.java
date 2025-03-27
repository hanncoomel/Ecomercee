/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecommerce;

/**
 *
 * @author nonha
 */
public class Ecommerce {
    
    //product name and price
    static String[] productNames = { "Wireless Mouse" , "Bluetooth Speaker" , "Smartphone Stand" , "Portable Charger" };
    static double [] prices = { 120.00 , 350.00 , 200.00 , 150.00 };
    
    public static void main(String[] args) {
        double[] discounts = calculateDiscountProduct();
        double totalDiscount = calculateTotalDiscount(discounts);
        
        displayDiscount(discounts, totalDiscount);
    }
    
    public static double [] calculateDiscountProduct() {
        double[] discounts = new double[prices.length];
        for (int i = 0; i < prices.length; i++){
        double discount = prices[i] * 0.30;
        discounts[i] = (discount >= 40.00) ? discount : 40.00;
            }
            return discounts;
    }
    
    public static double calculateTotalDiscount(double[] discounts) {
        double total = 0;
        for (double discount : discounts){
            total += discount;
        }
        return total;
    }
    
    public static void displayDiscount(double[] discounts, double totalDiscount){
        
        System.out.println("---------------------------------");
        System.out.println("Product Name         Price(RM)    Discount(RM)");
        System.out.println("---------------------------------");
        for (int i = 0; i < productNames.length; i++){
            System.out.printf("%-20s %8.2f %14.2f%n" , productNames[i] , prices[i] , discounts[i]);
        }
        
        System.out.println("---------------------------------");
        System.out.printf("Total Discount RM %.2f%n" , totalDiscount);
        
    
    
    }
    
    }


        
    