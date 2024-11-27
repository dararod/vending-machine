package Model;

public class CashRegister {
    int id;
    Currency[] cashRegister;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Currency[] getCaja() {
        return cashRegister;
    }

    public void setCaja(Currency[] cashRegister) {
        this.cashRegister = cashRegister;
    }
    
    public void createCashRegister(int number) {
        cashRegister = new Currency[number];
    }
    
    public double cashRegisterMoney() {
        double monto = 0;
        for(int i = 0; i < cashRegister.length; i++) {
            monto = monto + cashRegister[i].moneyQuantity();
        }
        
        return monto;
    }
}
