package entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author jnjeru
 */
public class Product implements Serializable{
    
    String name;
    int quantity;
    double amount;
    double discount;

    public Product(String name, int quantity, double amount, double discount) {
        this.name = name;
        this.quantity = quantity;
        this.amount = amount;
        this.discount = discount;
    }

    public Product() {
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()+this.quantity;
        /*return super.hashCode();*/ //To change body of generated methods, choose Tools | Templates.
    } 

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", quantity=" + quantity + ", price=" + amount + ", discount=" + discount + '}';
    }
    private static final Logger LOG = Logger.getLogger(Product.class.getName());        
    
}
