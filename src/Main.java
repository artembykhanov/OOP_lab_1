public class Main {
    public static void main(String[] args) {
        Account account = new Account("user", "drus");
        Debit_Card debitCard = new Debit_Card(23131232, "дрюс", account);
        Customer customer = new Customer("drus", "25vlksm", "22.08.2004");
        customer.owns(debitCard,account);
        debitCard.access();
    }
}