package entities;

public class Account {
    private int num;
    private String holder;
    private double balance;
    private boolean status;

    public int getNum() { return num; }
    public void setNum(int num) { this.num = num; }

    public String getHolder() { return holder; }
    public void setHolder(String nameClient) { this.holder = nameClient; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public boolean isStatus() { return status; }
    public void setStatus(boolean status) { this.status = status; }

    public Account(int num, String nameClient, double balance){
        setNum(num);
        setHolder(nameClient);
        setBalance(balance);
        setStatus(true);
    }

    public Account(int num, String nameClient){
        setNum(num);
        setHolder(nameClient);
        setBalance(0);
        setStatus(true);
    }

    public void statusAccount(){
        System.out.println("Bank account status:");
        System.out.println("Number: " + getNum());
        System.out.println("Holder: " + getHolder());
        System.out.println("Balance: $" + getBalance());
        System.out.printf("Status: " + isStatus());
        System.out.printf("\n");
    }

    public void withdraw(double amount){
        setBalance((getBalance() - amount) - 5);
    }

    public void deposit(double amount){
        setBalance(getBalance() + amount);
    }
}
