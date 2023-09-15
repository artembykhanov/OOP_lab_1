import java.util.Scanner;

public class Withdrawl_transaction extends ATM_Transaction {
    public Integer amount;

    public Withdrawl_transaction(Integer transactionId, String date, String type, Integer amount) {
        super(transactionId, date, type);
        this.amount = amount;
    }
    public void withdrawl() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму для снятия: ");
        Integer withdrawalAmount = scanner.nextInt();

        //тут какие-то методы

        this.amount = withdrawalAmount;

        scanner.close();
    }
}
