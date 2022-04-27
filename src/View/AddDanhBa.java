package View;

import Controller.DanhBaController;
import Service.DanhBa.IDanhBaServiceIMPL;
import Model.DanhBa;

import java.util.Scanner;
import java.util.regex.Pattern;

public class AddDanhBa {
    Scanner sc = new Scanner(System.in);
    DanhBaController danhBaController = new DanhBaController();

    public AddDanhBa() {
        while (true) {
            int id;
            if (IDanhBaServiceIMPL.danhBaList.size() == 0) {
                id = 1;
            } else {
                id = IDanhBaServiceIMPL.danhBaList.get(IDanhBaServiceIMPL.danhBaList.size() - 1).getId() + 1;
            }
            System.out.println("====<>====Thêm danh bạ====<>====");
            System.out.println("Nhập SĐT: ");
            int numPhone = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhập nhóm: ");
            String nhom = sc.nextLine();
            System.out.println("Nhập họ và tên: ");
            String name = sc.nextLine();
            System.out.println("Nhập giới tính: ");
            String gTinh = sc.nextLine();
            System.out.println("Nhập địa chỉ: ");
            String address = sc.nextLine();
            System.out.println("Nhập ngày sinh: ");
            int date = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhập Email: ");
            String email = sc.nextLine();


//            String email;
//            boolean checkUsername;
//            System.out.println("Nhập Email: ");
//            email = sc.nextLine();
//            checkUsername = Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$",email);
//            if(!checkUsername){
//                System.err.println("Username Failed! Please try again!");
//            }else
//                System.err.println("Username is existed! Please try again!");
//            }

            DanhBa danhBa = new DanhBa(id, numPhone, nhom, name, gTinh, address, date, email);
            danhBaController.writeToDanhBa(danhBa);

            System.out.println("Nhap chu bat ky de tiep tuc! ");
            System.out.println("Nhap 'quit' de quay lai Main ");
            String backMenu = sc.nextLine();
            if (backMenu.equalsIgnoreCase("quit")) {
                new Main();
            }
        }
    }
}
