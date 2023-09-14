import java.security.PublicKey;

public class ATM {
    public String location;
    public String managedBy;

    public ATM(String location, String managedBy) {
        this.location = location;
        this.managedBy = managedBy;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getManagedBy() {
        return managedBy;
    }

    public void setManagedBy(String managedBy) {
        this.managedBy = managedBy;
    }

    public void identifies(ATM_Transaction atm_transaction){
        System.out.println("Дата транзакции: "+ atm_transaction.getDate()+"; Тип транзакции: "+ atm_transaction.getType());
    }

    public void transactions(ATM_Transaction atm_transaction){
        System.out.println("Номер транзакции: "+ atm_transaction.getTransactionId());
    }
}
