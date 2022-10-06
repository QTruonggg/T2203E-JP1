package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.Observable;
import java.util.ResourceBundle;


public class FormSVController implements Initializable{
    public TextField txtName;
    public TextField txtMail;
    public TextField txtPoin;
    public ListView<Student> lv;
    public Text errors;

    private boolean sortName = true;
    private boolean sortPoin = true;

    private ObservableList<Student> List = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        List.add(new Student("abc", "abc@gmail.com", 1));
        List.add(new Student("abc", "abc@gmail.com", 2));
        lv.setItems(List);
    }

    public void add(){
        try {
            errors.setVisible(false);
            Integer poin = Integer.parseInt(txtPoin.getText());
            if (txtName.getText().isEmpty() || txtMail.getText().isEmpty() || !txtMail.getText().contains("@")
                    || txtMail.getText().startsWith("@") || txtMail.getText().endsWith("@") || poin < 0 || poin > 100){
                throw new Exception("Vui long nhap day du thong tin");

            }
            List.add(new Student(txtName.getText(),txtMail.getText(),poin));
            printResult();
            clearInput();
        } catch (Exception e) {
            errors.setText(e.getMessage());
            errors.setVisible(true);
        }



    }
    public void printResult(){
        lv.setItems(List);
        lv.refresh();
    }

    public void clearInput(){
        txtName.setText("");
        txtMail.setText("");
        txtPoin.setText("");
    }


    public void sxName() {
        Collections.sort(List, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return sortName?o1.getName().compareTo(o2.getName()):o2.getName().compareTo(o1.getName());
            }
        });

        sortName = !sortName;
        lv.refresh();

    }

    public void sxPoin() {
        Collections.sort(List, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return sortPoin?o1.getPoin()- o2.getPoin():o2.getPoin()- o1.getPoin();
            }
        });

        sortPoin = !sortPoin;
        lv.refresh();

    }


}