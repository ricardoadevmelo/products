package exercicios.clasAtrMet.product.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock (){
        return quantity * price;
    }
    public int addProducts (int quantity){
        return this.quantity += quantity;
    }
    public int removeProducts (int quantity) {
        return this.quantity -= quantity;
    }

   public String toString() {
       return name
               + ", $ "
               + String.format("%.2f", price)
               + ", "
               + quantity
               + " units, Total: $ "
               + String.format("%.2f", totalValueInStock());
   }
}
