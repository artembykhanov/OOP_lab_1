import java.util.List;

public class Debit_Card {
    public Integer cardNo;
    public String ownnedBy;
    public Account account;

    public Debit_Card(Integer cardNo, String ownnedBy, Account account) {
        this.cardNo = cardNo;
        this.ownnedBy = ownnedBy;
        this.account = account;
    }

    public Integer getCardNo() {
        return cardNo;
    }

    public void setCardNo(Integer cardNo) {
        this.cardNo = cardNo;
    }

    public String getOwnnedBy() {
        return ownnedBy;
    }

    public void setOwnnedBy(String ownnedBy) {
        this.ownnedBy = ownnedBy;
    }

    public void access(){
        System.out.println("К карте имеет доступ "+ account.getOwner());
    }
}
