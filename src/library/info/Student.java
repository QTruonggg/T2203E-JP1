package library.info;

public class Student {
    Integer idsd;
    String namesd;
    String email;
    String tel;

    public Student() {
    }

    public Student(Integer idsd, String namesd, String email, String tel) {
        this.idsd = idsd;
        this.namesd = namesd;
        this.email = email;
        this.tel = tel;
    }

    public Integer getIdsd() {
        return idsd;
    }

    public void setIdsd(Integer idsd) {
        this.idsd = idsd;
    }

    public String getNamesd() {
        return namesd;
    }

    public void setNamesd(String namesd) {
        this.namesd = namesd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String emai) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
