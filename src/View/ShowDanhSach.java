package View;

import Controller.DanhBaController;
import Service.DanhBa.IDanhBaServiceIMPL;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Scanner;

public class ShowDanhSach {
    Scanner sc = new Scanner(System.in);
    DanhBaController danhBaController = new DanhBaController();
    IDanhBaServiceIMPL iDanhBaServiceIMPL = new IDanhBaServiceIMPL();

    public void ShowListDanhSach() {
        System.out.println(danhBaController.showListDanhBa());
        System.out.println("Nhap bat ki de tiep tuc hoac 'quit' de thoat: ");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("quit")) {
            new Main();
        }

    }


    public void DeleteById() {
        System.out.println(danhBaController.showListDanhBa());
        System.out.println("===<>===Xóa bài hát theo id===<>===");
        int choice = sc.nextInt();
        new IDanhBaServiceIMPL().Delete(choice);
    }

    public void editDanhBaByID() {
        System.out.println(danhBaController.showListDanhBa());
        System.out.println("Nhap id");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập SĐT mới: ");
        int numPhone = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập nhóm mới: ");
        String nhom = sc.nextLine();
        System.out.println("Nhập họ và tên mới: ");
        String name = sc.nextLine();
        System.out.println("Nhập giới tính mới: ");
        String gTinh = sc.nextLine();
        System.out.println("Nhập địa chỉ mới: ");
        String address = sc.nextLine();
        System.out.println("Nhập ngày sinh mới: ");
        int date = sc.nextInt();
        System.out.println("Nhập Email mới: ");
        String email = sc.nextLine();
        iDanhBaServiceIMPL.editDanhBaByID(id,numPhone,nhom,name, gTinh, address, date, email );

        System.out.println("Edit success!");

        System.out.println("Nhap bat ki de tiep tuc hoac 'quit' de thoat: ");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("quit")) {
            new Main();
        }

    }

    public void findDanhBaByName(){
        System.out.println("Nhập tên cần tìm: ");
        String name = sc.nextLine();
        boolean check = true;
        for (int i = 0; i < IDanhBaServiceIMPL.danhBaList.size(); i++) {
            if (name.equalsIgnoreCase(IDanhBaServiceIMPL.danhBaList.get(i).getName())) {
                check = false;
            }
        }

        System.out.println(new IDanhBaServiceIMPL().findByName(name));



    }
}
