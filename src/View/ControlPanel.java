package View;

import Model.CashRegister;
import Model.Currency;
import javax.swing.JOptionPane;

public class ControlPanel {

    public static void main(String[] args) {
        Currency bill;
        CashRegister registerCash;
        registerCash = new CashRegister();

        int quantity = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "How many diferent currencies are we gonna use?"
        ));
        
        registerCash.createCashRegister(quantity);
        Currency[] bills = new Currency[quantity];
        
        double billValue;
        String billName;
        int billQuantity;
        
        for(int i = 0; i < quantity; i++) {
            bill = new Currency();
            billValue = Double.parseDouble(JOptionPane.showInputDialog(
                    null,
                    "What value is your bill"
            ));
            billName = JOptionPane.showInputDialog(
                    null,
                    "What is the name of your bill"
            );
            billQuantity = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "How many bills of " + billValue + " are you going to keep in the cash register"
            ));
            
            bill.setName(billName);
            bill.setValue(billValue);
            bill.increaseQuantity(billQuantity);
            bills[i] = bill;
            
        }
        
        registerCash.setCaja(bills);
        JOptionPane.showMessageDialog(null, "Total cash: " + registerCash.cashRegisterMoney());
    }
}
