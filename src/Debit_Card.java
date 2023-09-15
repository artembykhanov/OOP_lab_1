import java.util.List;

public class Debit_Card {
    public Integer cardNo;
    public String ownnedBy;

    public Debit_Card(Integer cardNo, String ownnedBy) {
        this.cardNo = cardNo;
        this.ownnedBy = ownnedBy;
    }

    public void access(Account account){
        System.out.println("К карте имеет доступ "+ account.owner);
    }
}
