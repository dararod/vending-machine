package Model;
public class Currency {
    double value;
    int quantity;
    String name;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double moneyQuantity() {
        return getQuantity() * getValue();
    }
    
    public void increaseQuantity(int number) {
        if (number > 0) {
            setQuantity(getQuantity() + number);
        } else {
            System.out.println("The quantity to increase should be positive");
        }
    }
    
    public void decreaseQuantity(int number) {
        if (number > 0) {
            int saldo = getQuantity() - number;
            
            if (saldo >= 0) {
                setQuantity(saldo);
            } else {
                System.out.println("The amount to increase should be higher than zero");
            }
        }
    }
}
