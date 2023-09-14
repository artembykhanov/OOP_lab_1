public class Bank {
    public String code;
    public String address;

    public Bank(String code, String address) {
        this.code = code;
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void manages(Debit_Card debitCard) {
        System.out.println("Банк обслуживает карту с номером: " + debitCard.getCardNo());
    }

    public void maintains(ATM atm) {
        System.out.println("Банк обслуживает банкомат по адресу " + atm.getLocation());
    }
}
