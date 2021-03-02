/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Test {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int choose;
        Scanner input = new Scanner(System.in);
        String enter;
        String pass;
        int demNguoiDoc = 0;
        int demSach = 0;
        int demTacGia = 0;
        // Mang doc gia
        ArrayList readList = new ArrayList();
        SinhVien[] nguoiDoc = new SinhVien[130];
        // Mang sach tham khao
         ArrayList sach = new ArrayList();
         SachThamKhao[] sachTK = new SachThamKhao[100];
         // Mang sach gia trinh
         ArrayList sachGiaoTrinhList = new ArrayList();
         SachGiaoTrinh[] sachGT = new SachGiaoTrinh[100];
        //Mang danh sach nguoi muon
        ArrayList dsNguoiMuon = new ArrayList();
        DanhSachNguoiMuon[]nguoiMuon = new DanhSachNguoiMuon[4];
        int demNguoiMuon=0;
        // Mang tac gia
        ArrayList danhSachTacGia = new ArrayList();
        TacGia[] tacgia = new TacGia[10];
        tacgia[0]= new TacGia("Nicholas G. Carr", 'M');
        danhSachTacGia.add(tacgia[0]);
        tacgia[1]= new TacGia("Pham Huy Hoang", 'F');
        danhSachTacGia.add(tacgia[1]);
        tacgia[2]= new TacGia(" Bruce Eckel", 'M');
        danhSachTacGia.add(tacgia[2]);
        //Hien thi ten truong
        ThuThu a = new ThuThu();
        System.out.println("Truong: "+a.Truong);
        do {
            System.out.println("---DANG NHAP---");
            System.out.println("Ten nguoi dung: ");
            enter = input.nextLine();
            System.out.println("Mat khau : ");
            pass = input.nextLine();
            if (!enter.equals(a.TenNguoiDung) || !pass.equals(a.matKhau)) {
                System.out.println("Ten dang nhap hoac mat khau khau khong dung!");
            } else {
                System.out.println("Ban da dang nhap thanh cong!");
            }
        } while (!enter.equals(a.TenNguoiDung) || !pass.equals(a.matKhau));
        do {
            menu();
            choose = input.nextInt();
            switch (choose) {
                case 1: {
                    System.out.println("---QUAN LY DOC GIA---");
                    int luaChon;
                    do {
                        menuQuanLyDocGia();
                        luaChon = input.nextInt();                       
                        int i = 0;
                        switch (luaChon) {
                            case 1: {   //Lap the doc gia
                                input.nextLine();
                                while (i > -1) {
                                   System.out.println("--LAP THE DOC GIA--");                                    
                                   System.out.println("Nhap ma sinh vien (vd:19PN18): ");                                   
                                   String maSV = input.nextLine();
                                   System.out.println("Nhap ten sinh vien: ");
                                   String name = input.nextLine();
                                   System.out.println("Nhap lop: ");
                                   String lop = input.nextLine();
                                   System.out.println("Nhap email cua sinh vien: ");
                                   String mail = input.nextLine();
                                   nguoiDoc[i] = new SinhVien(maSV, name, lop, mail);
                                   demNguoiDoc++;
                                    readList.add(nguoiDoc[i]);
                                    System.out.println("Ban co muon nhap them hay khong. Neu (C)o hoac (K)hong: ");
                                    char add = input.nextLine().charAt(0);
                                    if (add == 'C') {
                                        i++;
                                    } else {
                                        break;
                                    }
                                }
                                break;
                            }
                            case 2:{    //Xoa thong tin doc gia
                                int index;
                                System.out.println("--XOA THONG TIN DOC GIA--");
                                System.out.println("Nhap vi tri doc gia ma ban muon xoa (Nhap so): ");
                                index = input.nextInt();
                                System.out.println("Thong tin can xoa la: ");
                                System.out.println(readList.get(index));
                                readList.remove(index);
                                System.out.println("Doc gia tai vi tri nay da duoc xoa");                                            
                                break;
                            }
                            case 3: {   //Sua thong tin doc gia
                                int index;
                                System.out.println("--SUA THONG TIN DOC GIA--");
                                System.out.println("Nhap vi tri doc gia ma ban muon sua: ");
                                index = input.nextInt();
                                System.out.println("Day la thong tin doc gia ma ban muon sua: ");
                                System.out.println(readList.get(index));
                                int chon;
                                do {
                                    menuSua();
                                    chon = input.nextInt();
                                    switch (chon)   {
                                        case 1: {   //Sua ma sinh vien
                                            System.out.println("--Sua ma sinh vien--");
                                            input.nextLine();
                                            String ma = input.nextLine();
                                            nguoiDoc[index].setID(ma);
                                            break;
                                        }
                                        case 2: {   //Sua ten sinh vien
                                            System.out.println("--Sua ten sinh vien--");
                                            input.nextLine();
                                            String sinhVien = input.nextLine();
                                            nguoiDoc[index].setReaderName(sinhVien);
                                            break;
                                        }
                                        case 3: {   //Sua ten lop
                                            System.out.println("--Sua ten lop-- ");
                                            input.nextLine();
                                            String lop = input.nextLine();
                                            nguoiDoc[index].setClassStudent(lop);
                                            break;
                                        }
                                        case 4: {
                                            System.out.println("--Sua gmail-- ");
                                            input.nextLine();
                                            String gmail = input.nextLine();
                                            nguoiDoc[index].setMail(gmail);
                                            break;
                                        }
                                        case 5 :
                                            break;
                                    }
                                } while (chon!=5);                               
                            }
                            case 4: {   //Xem thong tin doc gia
                                System.out.println("--XEM THONG TIN DOC GIA--");
                                if(demNguoiDoc>0){
                                for (int j = 0; j<readList.size(); j++) {
                                    System.out.println("STT: "+j+" "+readList.get(j));
                                }
                                }
                                else{
                                System.out.println("Chua co doc gia nao ca!");
                                }
                                break;
                            }
                            case 5:
                                break;
                        }
                    } while (luaChon != 5);
                    break;
                }
                case 2: {   //Quan ly muon tra
                    System.out.println("---QUAN LY MUON TRA---");
                    int luaChon;
                    int i=0;
                    do{
                       menuMuonTra();
                       luaChon = input.nextInt();
                       switch(luaChon){
                           case 1:{ //Nhap thong tin nguoi muon(Ca lap ma the truoc)  
                               input.nextLine();
                               System.out.println("--NHAP THONG TIN NGUOI MUON--");
                               System.out.println("Nhap ma the sinh vien: "); //Muon kiem tra ma the co ton tai khong
                               String maThe = input.nextLine();
                               while(i>-1){
                               //   nguoiMuon[i].nhapNguoiMuon();
                                  System.out.println("Ten nguoi muon: ");
                                  String tenNguoiMuon=input.nextLine();
                                  System.out.println("Ten tai lieu: ");
                                  String  tenTaiLieu=input.nextLine();
                                  System.out.println("Ngay muon: ");
                                  String ngayMuon=input.nextLine();
                                  System.out.println("Ngay tra: ");
                                  String ngayTra=input.nextLine();
                                  nguoiMuon[i]=new DanhSachNguoiMuon(tenNguoiMuon, tenTaiLieu, ngayMuon, ngayTra);
                                  dsNguoiMuon.add(nguoiMuon[i]);
                                  demNguoiMuon++;
                                  System.out.println("Ban co muon nhap them hay khong. Neu (C)o hoac (K)hong: ");
                                    char add = input.nextLine().charAt(0);
                                    if (add == 'C') {
                                        i++;
                                    } else {
                                        break;
                                    }
                                  }
                             break;  
                           }
                           case 2:{
                               System.out.println("--DANH SACH NGUOI MUON--");
                                if(demNguoiMuon>0){
                                for (int k = 0; k<dsNguoiMuon.size(); k++) {
                                    System.out.println("STT: "+k+" "+dsNguoiMuon.get(k));
                                }
                                }
                                else{
                                System.out.println("Chua co nguoi muon nao ca!");
                                }
                                break;
                           }
                           case 3:{
                               System.out.println("--XOA THONG TIN SINH VIEN KHI TRA SACH--");
                               int index;
                                System.out.println("Nhap vi tri doc gia ma ban muon xoa (Nhap so): ");
                                index = input.nextInt();
                                System.out.println("Thong tin can xoa la: ");
                                System.out.println(dsNguoiMuon.get(index));
                                dsNguoiMuon.remove(index);
                                System.out.println("Doc gia tai vi tri nay da duoc xoa");  
                                break;
                           }
                           case 4:{
                               break;
                           }
                       }
                    }
                    while(luaChon!=4);
                    break;
                }
                case 3: {   //Quan ly tai lieu
                    System.out.println("---QUAN LY TAI LIEU---");
                    int luaChon;
                    do {int i =4 ;
                        int l =4;
                        char them;
                        char gt;
                        sach();
                        luaChon = input.nextInt();
                        switch(luaChon){
                            case 1:{    //Them sach
                                input.nextLine();
                                do{
                                System.out.println("Neu them sach tham khao thi nhan (T) hoac sach giao trinh thi nhan (G): ");
                                 them = input.nextLine().charAt(0);
                                
                                if(them == 'T'){
                                while (i > -1 && l>-1) {
                                    System.out.println("--THEM SACH--");                                     
                                    System.out.println("Nhap ma sach: ");                                   
                                    String maSach = input.nextLine();
                                    System.out.println("Nhap ten sach: ");
                                    String name = input.nextLine();
                                    System.out.println("Nhap ten tac gia: ");
                                    String ten =input.nextLine();
                                    do {
                                    System.out.println("Gioi tinh tac gia: ");
                                    gt = input.nextLine().charAt(0);  
                                    } while (gt!='F'&&gt!='M');                         
                                    tacgia[l]=new TacGia(ten, gt);
                                    demTacGia++;
                                    System.out.println("Nhap gia: ");
                                    float gia = input.nextFloat();
                                    input.nextLine();
                                    System.out.println("Nhap nha xuat ban: ");
                                    String NXB = input.nextLine();
                                    sachTK[i] = new SachThamKhao(maSach, name, tacgia[l], gia, NXB);
                                    demSach++;
                                    sach.add(sachTK[i]);
                                    System.out.println("Ban co muon nhap them hay khong. Neu (C)o hoac (K)hong: ");                                    
                                    char add = input.nextLine().charAt(0);
                                    if (add == 'C') {
                                        i++;
                                        l++;
                                    } else {
                                        break;
                                    }
                                }
                                }
                                else {
                                    while (i > -1 && l>-1) {
                                    System.out.println("--THEM SACH--");                                     
                                    System.out.println("Nhap ma sach: ");                                   
                                    String maSach = input.nextLine();
                                    System.out.println("Nhap ten sach: ");
                                    String name = input.nextLine();
                                    System.out.println("Nhap ten tac gia: ");
                                    String ten =input.nextLine();
                                    do {
                                    System.out.println("Gioi tinh tac gia: ");
                                    gt = input.nextLine().charAt(0); 
                                     } while (gt!='F'&&gt!='M');                                  
                                    tacgia[l]=new TacGia(ten, gt);
                                    demTacGia++;//dem so luong tac gia
                                    System.out.println("Nhap gia: ");
                                    float gia = input.nextFloat();
                                    input.nextLine();
                                    System.out.println("Nhap nha xuat ban: ");
                                    String NXB = input.nextLine();
                                    sachGT[i] = new SachGiaoTrinh(maSach, name, tacgia[l], gia, NXB);
                                    demSach++; //dem so luong sach                            
                                    sachGiaoTrinhList.add(sachTK[i]);
                                    System.out.println("Ban co muon nhap them hay khong. Neu (C)o hoac (K)hong: ");
                                    char add = input.nextLine().charAt(0);
                                    if (add == 'C') {
                                        i++;
                                        l++;
                                    } else {
                                        break;
                                    }
                                }
                                }
                                } while (them!='T'||them!='G');
                                break;
                            }
                            case 2:{ //Xoa sach hu hong
                                char chon;
                                int index;
                                input.nextLine();
                                System.out.println("--XOA TAI LIEU--");
                                do{
                                System.out.println("Ban muon xoa loai tai lieu nao?");
                                System.out.println("Nhap (T)ham khao hoac (G)iao trinh: ");
                                chon = input.nextLine().charAt(0);
                                }while(chon!='T'&&chon!='G');
                                if(chon=='T'){
                                System.out.println("Nhap vi tri tai lieu ma ban muon xoa (Nhap so): ");
                                index = input.nextInt();
                                System.out.println("Thong tin can xoa la: ");
                                System.out.println(sach.get(index));
                                
                                sach.remove(index);
                                System.out.println("Doc gia tai vi tri nay da duoc xoa");                               
                                break;
                                }
                                else{
                                System.out.println("Nhap vi tri tai lieu ma ban muon xoa (Nhap so): ");
                                index = input.nextInt();
                                System.out.println("Thong tin can xoa la: ");
                                System.out.println(sachGiaoTrinhList.get(index));
                                sachGiaoTrinhList.remove(index);
                                System.out.println("Doc gia tai vi tri nay da duoc xoa");                               
                                break;   
                                }
                            }
                            case 3:{    //danh sach sach hien co
                                System.out.println("--DANH SACH SACH HIEN CO--");
                                input.nextLine();
                                sachTK[0] = new SachThamKhao("TK1","Lieu IT da het thoi" , tacgia[0],67000 , "Nha xuat ban tre");
                                sach.add(sachTK[0]);
                                sachTK[1] = new SachThamKhao("TK2","Code Dạo Kí Sự" , tacgia[1],122872 , "Nha xuat ban Dan Tri");
                                sach.add(sachTK[1]);
                                sachTK[2] = new SachThamKhao("TK3","Thinking In Java" , tacgia[2],250000 , "Nha xuat ban Dan Tri");
                                sach.add(sachTK[2]);
                                
                                for(int m = 0; m< sach.size(); m++){
                                    System.out.println(m+". "+sach.get(m));
                                }
                                /*sachGT[0]=new SachGiaoTrinh("OOP1","Lap trinh huong doi tuong");
                                sachGiaoTrinhList.add(sachGT[0]);
                                sachGT[1]=new SachGiaoTrinh("C2","Lap trinh C");
                                sachGiaoTrinhList.add(sachGT[1]);
                                sachGT[2]=new SachGiaoTrinh("NET45","Basic Networking");
                                sachGiaoTrinhList.add(sachGT[2]);
                    
                             
                                for(int p = 0; p<sachGiaoTrinhList.size();p++){
                                    System.out.println(p+". "+sachGiaoTrinhList.get(p));
                                }*/
                                break;
                            }
                            case 4: {//Danh sach tac gia
                                System.out.println("--DANH SACH TAC GIA--");
                                for(int j =0; j<danhSachTacGia.size(); j++){
                                        System.out.println(j+". "+tacgia[j].toString());
                                    }  
                                break;
                            }
                            case 5:{//Thoat
                                break;
                            }
                        }
                        
                    } while (luaChon!=5);                    
                    break;
                }
                case 4: {
                    break;
                }
            }
        } while (choose != 4);

    }

    public static void menu() {
        System.out.println("----QUAN LY THU VIEN-----");
        System.out.println("*************************");
        System.out.println("*1. Quan ly doc gia     *");
        System.out.println("*2. Quan ly muon tra    *");
        System.out.println("*3. Quan ly tai lieu    *");
        System.out.println("*4. Thoat               *");
        System.out.println("*************************");
        System.out.println("Lua chon cua ban la: ");
    }

    public static void menuQuanLyDocGia() {
        System.out.println("--------------------------");
        System.out.println("1. Lap the doc gia ");
        System.out.println("2. Xoa thong tin doc gia ");
        System.out.println("3. Sua thong tin doc gia ");
        System.out.println("4. Xem thong tin doc gia ");
        System.out.println("5. Thoat ");
        System.out.println("Lua chon cua ban la: ");
    }
    public static void menuSua(){
        System.out.println("--------------------------");
        System.out.println("1. Sua ma sinh vien ");
        System.out.println("2. Sua ten sinh vien ");
        System.out.println("3. Sua lop ");
        System.out.println("4. Sua gmail ");
        System.out.println("5. Thoat ");
        System.out.println("Lua chon cua ban la: ");
    }
    public static void sach(){
        System.out.println("--------------------------");
        System.out.println("1. Them sach ");
        System.out.println("2. Xoa sach da hong ");
        System.out.println("3. Danh sach sach hien co ");
        System.out.println("4. Danh sach tac gia");
        System.out.println("5. Thoat");
        System.out.println("Lua chon cua ban la: ");
    }
    public static void menuMuonTra(){
        System.out.println("--------------------------");
        System.out.println("1. Nhap thong tin sinh vien muon ");
        System.out.println("2. Danh sach nguoi muon ");
        System.out.println("3. Xoa thong tin sinh vien khi tra sach ");
        System.out.println("4. Thoat ");
        System.out.println("Lua chon cua ban la: ");
    }

}
