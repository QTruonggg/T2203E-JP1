package AssignmentJP1.Exercise1;

public class Main {
    public static void main(String[] args){
        Bank b = new Bank(1000, 10);
        double interest = b.calculateInterest(b.balance,b.rate);
        System.out.println("Then monthly interest is: $ " + Math.round(interest*100.0)/100.0);
    }
}