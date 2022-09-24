package session4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{
    ArrayList<String> PhoneList = new ArrayList<>();
    @Override
    // Tìm kiếm và thêm mới sđt
    public void insertPhone(String name, String phone) {
        if (PhoneList.isEmpty()){  // nếu danh bạ chưa có gì thì thêm sđt
            PhoneList.add(name + ", " + phone);
        }else{ // nếu danh bạ đã có số thì check theo name
            String pb = searchPhone(name);
            if (searchPhone(name) != null){
                if (!pb.contains(phone)){
                    PhoneList.set(PhoneList.indexOf(pb), pb + " : " + phone);

                }
            }else{
                PhoneList.add(name + ", " + phone);
            }
        }
    }

    @Override
    // Xoá sđt trong danh bạ
    public void removePhone(String name) {
        if (PhoneList.isEmpty()) {
            System.out.println("Danh bạ trống");
        } else {
            String pb = searchPhone(name);
            if (pb != null) {  // nếu tìm thấy thì xoá số
                PhoneList.remove(pb);
                System.out.println("Đã xoá người dùng " + name + " kèm số diện thoại khỏi danh bạ");
            } else {
                System.out.println("Không tìm thấy người dùng " + name + " trong danh bạ");
            }
        }
    }


    @Override
    public void updatePhone(String name, String newphone) {
        if (PhoneList.isEmpty()){
            System.out.println("Danh bạ trống!");
        }else{
            String pb = searchPhone(name);
            if(pb != null){
                if (!pb.contains(newphone)){  // nếu tìm thấy ng dùng trong danh bạ thì mới update - xoá số cũ thành số mói
                    PhoneList.set(PhoneList.indexOf(pb), pb.split(",")[0]+", " +newphone);
                }else{  // nếu k tìm thấy ng dùng trong danh bạ thì k update
                    System.out.println("Không tìm thấy người dùng " + name + " trong danh bạ để update");
                }
            }
        }
    }

    @Override
    public String searchPhone(String name) {
        for (String pb : PhoneList){
            if (pb.split(",")[0].equals(name)){  // nếu tìm thấy thì in ra luôn
                return pb;
            }
        }

        return null; // nếu k tìm thấy thì trả về null
    }

    @Override
    // Sắp xếp list theo tên ng dùng
    public void sort() {
        if (PhoneList.isEmpty()){
            System.out.println("Danh bạ trống!");
        }else{
            // sắp xếp tăng dần:
            System.out.println("Sắp xếp tăng dần:");
            Collections.sort(PhoneList, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    /* cách 1 : dài dòng dùng để so sánh số
                    if (o1.compareTo(o2) > 0){
                        return 1;
                    }else if (o1.compareTo(o2) == 0){
                        return 0;
                    }else{
                       return -1;
                    }
                     */
                    // cách 2 ngắn gọn (compareTo - so sánh chuỗi)
                    return o1.compareTo(o2);
                }
            });
            System.out.println(PhoneList);
            System.out.println("Sắp xếp giảm dần:");
            Collections.sort(PhoneList, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o2.compareTo(o1);
                }
            });
            System.out.println(PhoneList);
        }
    }
}
