package session1;

public class PhanSo {
    private  int tuSo;
    private int mauSo;

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public  PhanSo(int ts, int ms) {

    }

    // Ham in phan so
    public void inPS() {



        if (tuSo * mauSo < 0) {
            System.out.println("-" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
        } else {
            System.out.println(Math.abs(tuSo) + "/" + Math.abs(mauSo));
        }
    }

    // Ham cong 2 phan so
    public PhanSo add(PhanSo ps2) {
        int ts = tuSo * ps2.mauSo + ps2.tuSo * mauSo;
        int ms = mauSo * ps2.mauSo;
        return new PhanSo(ts, ms);
    }

    // Ham tru 2 phan so
    public PhanSo sub(PhanSo ps2) {
        int ts = tuSo * ps2.mauSo - ps2.tuSo * mauSo;
        int ms = mauSo * ps2.mauSo;
        return new PhanSo(ts, ms);
    }

    // Ham nhan 2 phan so
    public PhanSo mul(PhanSo ps2) {
        int ts = tuSo * ps2.tuSo;
        int ms = mauSo * ps2.mauSo;
        return new PhanSo(ts, ms);
    }

    // Ham nghich dao phan so
    public void ngichDao() {
        int tg = tuSo;
        tuSo = mauSo;
        mauSo = tg;
    }

    // Chia 2 phan so
    public PhanSo div(PhanSo ps2) {
        // Nghich dao ps2
        int tg = ps2.tuSo;
        ps2.tuSo = ps2.mauSo;
        ps2.mauSo = tg;

        // Nhan this vs ps2 (da nghich dao)
        int ts = tuSo * ps2.tuSo;
        int ms = mauSo * ps2.mauSo;
        return new PhanSo(ts, ms);
    }

    // Ham rut gon phan so
    public void rutGon() {
        // Tim uscln
        int a = tuSo;
        int b = mauSo;
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }

        // Toi gian phan so
        tuSo /= b;
        mauSo /= b;
    }
}



