import java.security.PublicKey;

public class ATM {
    public String location;
    public String managedBy;

    public ATM(String location, String managedBy) {
        this.location = location;
        this.managedBy = managedBy;
    }

    public void identifies(ATM_Transaction atm_transaction){
        System.out.println("Дата транзакции: "+ atm_transaction.date+"; Тип транзакции: "+ atm_transaction.type);
    }

    public void transactions(ATM_Transaction atm_transaction){
        System.out.println("Номер транзакции: "+ atm_transaction.transactionId);
    }
}
