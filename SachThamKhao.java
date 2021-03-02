/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

//import java.util.ArrayList;
//import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SachThamKhao extends Sach {
    
    public int soLuongSach = 0;
    
    public SachThamKhao(){
        
    }
    public SachThamKhao(String maSach, String tenSach, TacGia tacGia, float giaSach, String NXB ){
        super(maSach, tenSach, tacGia, giaSach,NXB);
        soLuongSach++;
    }
  
    @Override
    public int soLuongCuThe() {
       return soLuongSach;
    }

}
