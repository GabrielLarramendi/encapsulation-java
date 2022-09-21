package entities;

public class Account {

    private int accountNumber;
    private String accountHolder;
    private double accountBalance;

    public Account() {
    }

    public Account(int accountNumber, String accountHolder, double initialValue) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        accountDeposit(initialValue); //O parâmetro recebido é colocado na função que tem o papel de alterar o saldo da conta.
        //Assim, o valor colocado já é mandado direto para o atributo através da função.
    }

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void accountDeposit(double value) {
        accountBalance += value;
    }

    public void accountWithdraw(double value) {
        accountBalance -= (value + 5);
    }

    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder: "
                + accountHolder
                + ", Balance: $ "
                + String.format("%.2f", accountBalance);
    }

}
