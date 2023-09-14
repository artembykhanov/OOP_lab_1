public class Transfer_transaction extends ATM_Transaction {
    public Integer amount;
    public Integer accountNo;

    public Transfer_transaction(Integer transactionId, String date, String type, Integer amount, Integer accountNo) {
        super(transactionId, date, type);
        this.amount = amount;
        this.accountNo = accountNo;
    }
}
