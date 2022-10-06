package javafx;

public class Student {
    String name;
    String email;
    int poin;

    public Student(String name, String email, int poin) {
        this.name = name;
        this.email = email;
        this.poin = poin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPoin() {
        return poin;
    }

    public void setPoin(int poin) {
        this.poin = poin;
    }

    public String toString(){
        return(getName() + "-" + getEmail()+"-" +getPoin()+"\n");
    }
}
