package assignment;

public class Account {
    public int id;
    public String name;
    public int balance;

    public void Account() {
    }

    public void Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean credit(int amount){
        if(amount <=0) return true;
        balance+= amount;
        return false;

    }

    public boolean debit(int amount){
        if(amount <=0 || amount> balance)return true;
        balance-= amount;
        return false;

    }

    public boolean tranferTo(Account account, int amount){
        if(amount <=0 || amount> balance)return true;
        account.balance += amount;
        balance -= amount;
        return false;
    }
}
