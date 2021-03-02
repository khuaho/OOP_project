/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

//import java.util.Scanner;

/**
 *
 * @author admin
 */
public class DanhSachNguoiMuon {
    private String tenNguoiMuon;
    private String tenTaiLieu;
    private String ngayMuon;
    private String ngayTra;
    public DanhSachNguoiMuon(){
        
    }
    public DanhSachNguoiMuon(String tenNguoiMuon,String tenTaiLieu,String ngayMuon,String ngayTra){
        this.tenNguoiMuon = tenNguoiMuon;
        this.tenTaiLieu = tenTaiLieu;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
    }
    /*public void nhapNguoiMuon(){
     Scanner input = new Scanner(System.in);
     System.out.println("Ten nguoi muon: ");
     tenNguoiMuon=input.nextLine();
     System.out.println("Ten tai lieu: ");
     tenTaiLieu=input.nextLine();
     System.out.println("Ngay muon: ");
     ngayMuon=input.nextLine();
     System.out.println("Ngay tra: ");
     ngayTra=input.nextLine();
    }*/

    @Override
    public String toString() {
        return ("Ten nguoi muon: "+tenNguoiMuon+" Ten tai lieu: "+tenTaiLieu+" Ngay muon: "+ngayMuon+" Ngay tra: "+ngayTra); 
    }
}
