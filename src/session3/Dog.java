package session3;

public class Dog extends Animal{

    public int year;
    public Dog(){
    }

    public Dog(int id, String name, int year) {
        super(id, name);
        this.year = year;
    }

    public void eat(){
        System.out.println("Eat...");
    }

    public  void run(){
        System.out.println("Dog run...");
    }
}
