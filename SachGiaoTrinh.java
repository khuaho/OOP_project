/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author admin
 */
public class SachGiaoTrinh extends Sach {
  public int soLuongSachGT = 0;

    @Override
    public int soLuongCuThe() {
        return soLuongSachGT;
    }
    public SachGiaoTrinh(){
        
    }
    public SachGiaoTrinh(String maSach, String tenSach, TacGia tacGia, float giaSach, String NXB ){
        super(maSach, tenSach, tacGia, giaSach,NXB);
        soLuongSachGT++;
    }
    public SachGiaoTrinh(String maSach, String tenSach){
        super(maSach, tenSach);
    }
  
}
