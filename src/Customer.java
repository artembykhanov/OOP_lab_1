public class Customer {
    public String name;
    public String address;
    public String dob;

    public Customer(String name, String address, String dob) {
        this.name = name;
        this.address = address;
        this.dob = dob;
    }

    public void owns(Debit_Card debitCard, Account account) {
        System.out.println(name + " - Владелец карты: " + debitCard.ownnedBy + " имеет карту с номером: " + debitCard.cardNo);
        System.out.println(name + " - Владелец аккаунта: " + account.owner + " с типом пользователя: " + account.type);
    }
}
