package Model;
public class Basket {
    Product[] products;
    
    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    
    public double totalAmount(Product[] products) {
        double amount = 0;
        for(int i = 0; i < products.length; i++) {
            amount = amount + products[i].getPrice();
        }
        
        return amount;
    }
}
