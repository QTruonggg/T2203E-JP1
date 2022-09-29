package session5;

public class Main {
    public static void main(String[] args){
        int[] arr = new int[]{2, 3, 5};
        News a = new News(1, "asd", "12/12/1212", "asdf", "asdf");
        a.AverageRate= a.Calculate(arr[0],
                arr[1],
                arr[2]);
        a.display();
    }
}
