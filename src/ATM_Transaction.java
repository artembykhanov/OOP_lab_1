public class ATM_Transaction {
    public Integer transactionId;
    public String date;
    public String type;

    public ATM_Transaction(Integer transactionId, String date, String type) {
        this.transactionId = transactionId;
        this.date = date;
        this.type = type;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void update(){

    }
}
