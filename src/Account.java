import java.math.BigDecimal;
import java.util.Scanner;

public class Account extends AccountFunction{
    private String user;
    private BigDecimal balance = BigDecimal.ZERO;
    private String currency;


    public Account(String user, String currency) {
        this.user = user;
        this.currency = currency;
    }

    public Account() {

    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Account getAccount(Account account){
        return account;


    }


    @Override
    void deposit(String accountName, BigDecimal amount) {

        if (accountName.equalsIgnoreCase(user)){
           balance = balance.add(amount);
            System.out.println("DEPOSITED SUCCESSFULLY");
            System.out.println("CURRENT BALANCE: " + balance );
        }else {throw new RuntimeException("USER NOT FOUND");}


    }

    @Override
    public void withdraw(String userAccount, BigDecimal amount) {


        if (userAccount.equalsIgnoreCase(user)){
            if (amount.compareTo(balance)==1) {
                throw new RuntimeException("InsufficientFund");
            }
            balance=balance.subtract(amount);
            System.out.println("WITHDRAWN  SUCCESSFULLY");
            System.out.println("CURRENT BALANCE: " + balance);
        }else {throw new RuntimeException("NOT FOUND");
        }

        }


}
