import java.math.BigDecimal;

public abstract class AccountFunction {
    abstract void deposit(String user, BigDecimal amount);

    abstract void withdraw(String user, BigDecimal amount);
}
