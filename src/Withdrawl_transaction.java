public class Withdrawl_transaction extends ATM_Transaction {
    public Integer amount;

    public Withdrawl_transaction(Integer transactionId, String date, String type, Integer amount) {
        super(transactionId, date, type);
        this.amount = amount;
    }
    public void withdrawl(){

    }
}
