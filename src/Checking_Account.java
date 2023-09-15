import java.util.Scanner;

public class Checking_Account extends Account {
    public Integer accountNo;

    public Checking_Account(String type, String owner, Integer accountNo) {
        super(type, owner);
        this.accountNo = accountNo;
    }

    // Как снимать или пополнять сумму, если нет поля баланс???

    public void debit(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму для снятия: ");
        Integer amountDebit = scanner.nextInt();

        //тут какие-то методы



        scanner.close();

    }
    public void credit(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму для пополнения: ");
        Integer amountCredit = scanner.nextInt();

        //тут какие-то методы


        scanner.close();
    }
}
