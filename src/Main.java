import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME");

      Account account = new Account("samuel","EURO");
        account.deposit("samuel", BigDecimal.valueOf(500));
        account.withdraw("samuel", BigDecimal.valueOf(300));
    }
}