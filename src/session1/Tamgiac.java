package session1;

public class Tamgiac {
    int x;
    int y;
    int z;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public boolean ktTamgiac(){
        return x+y > z && x+z > y && y+z > x;
    }

    public int chuVi(){
        if(! ktTamgiac()) return 0;
        return x+y+z;
    }
    public double dienTich(){
        if(! ktTamgiac()) return 0;
        double cv2 = chuVi()/2.0;
        return Math.sqrt(cv2*(cv2-x)*(cv2-y)*(cv2-z));
    }

}
