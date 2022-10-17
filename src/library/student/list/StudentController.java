package library.student.list;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import library.info.Student;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class StudentController implements Initializable {
    public TableView<Student> tbStudents;
    public TableColumn<Student, Integer> tbIdSd;
    public TableColumn<Student, String> tbNameSd;
    public TableColumn<Student, String> tbEmail;
    public TableColumn<Student, String> tbTel;

    public final static String connectionString = "jdbc:mysql://localhost:3306/t2203e";
    public final static String user = "root";
    public final static String pwd = ""; // nếu là xampp: "", mamp:"root"

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tbIdSd.setCellValueFactory(new PropertyValueFactory<Student,Integer>("idsd"));
        tbNameSd.setCellValueFactory(new PropertyValueFactory<Student,String>("namesd"));
        tbEmail.setCellValueFactory(new PropertyValueFactory<Student,String>("email"));
        tbTel.setCellValueFactory(new PropertyValueFactory<Student,String>("tel"));

        ObservableList<Student> lt = FXCollections.observableArrayList();

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(connectionString,user,pwd);
            Statement statement = con.createStatement();
            String sql_txt = "select * from student";
            ResultSet rs = statement.executeQuery(sql_txt);
            while (rs.next()){
                int id = rs.getInt("idsd");
                String name = rs.getString("namesd");
                String email = rs.getString("email");
                String tel = rs.getString("tel");
                Student s = new Student(id,name,email,tel);
                lt.add(s);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            tbStudents.setItems(lt);
        }
    }
}
