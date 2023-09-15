public class Bank {
    public String code;
    public String address;

    public Bank(String code, String address) {
        this.code = code;
        this.address = address;
    }


    public void manages(Debit_Card debitCard) {
        System.out.println("Банк обслуживает карту с номером: " + debitCard.cardNo);
    }

    public void maintains(ATM atm) {
        System.out.println("Банк обслуживает банкомат по адресу " + atm.location);
    }
}
