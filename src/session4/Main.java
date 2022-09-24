package session4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        PhoneBook pb = new PhoneBook();
        pb.insertPhone("asfd", "0564863156");
        pb.insertPhone("dfb", "0456732489");
        pb.insertPhone("qwer", "0987654321");
        pb.insertPhone("vbn", "0369258147");
        //pb.removePhone("DEF");
        pb.updatePhone("gfhj", "0345678912");
        pb.sort();
        for (String pl : pb.PhoneList){
            System.out.println(pl);
        }
    }

}

