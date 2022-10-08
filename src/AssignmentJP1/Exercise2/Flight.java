package AssignmentJP1.Exercise2;

public class Flight {
    public int Number;
    public String destination;

    public Flight() {
        this.Number = 0;
        this.destination = "";
    }

    public Flight(int number, String destination) {
        if (number > 0){
            if(destination != "") {
                this.Number = number;
                this.destination = destination;
            } else {
                this.Number = 0;
                this.destination = "";
            }
        } else {
            this.Number = 0;
            this.destination = "";
        }
    }

    public void display(){
        System.out.println(this.Number + ", " + this.destination);
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

}
