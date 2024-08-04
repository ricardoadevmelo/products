package exercicios.clasAtrMet.product.application;

import exercicios.clasAtrMet.product.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        Scanner scanner = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = scanner.nextLine();
        System.out.print("Price: ");
        product.price = scanner.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = scanner.nextInt();
        System.out.println("Product data: " + product);
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = scanner.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: " + product);
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);
        scanner.close();
    }
}
