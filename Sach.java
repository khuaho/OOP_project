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
public abstract class Sach {
    protected String maSach;
    protected String tenSach;
    protected TacGia tacGia;
    protected float giaSach;
    protected String NXB;
    
    public Sach(){
        
    }
    public Sach(String maSach, String tenSach, TacGia tacGia, float giaSach, String NXB){
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.giaSach = giaSach;
        this.NXB = NXB;
       
    }
    public Sach(String maSach, String tenSach){
        this.maSach = maSach;
        this.tenSach = tenSach;
    }
    
    public abstract int soLuongCuThe();
    
    public void setMaSach(String maSach){
        this.maSach = maSach;
    }
    public String getMaSach(){
        return maSach;
    }
    public void setTenSach(String tenSach){
        this.tenSach = tenSach;
    }
    public String getTenSach(){
        return tenSach;
    }
    public void setTacGia(TacGia tacGia){
        this.tacGia = tacGia;
    }
    public TacGia getTacGia(){
        return tacGia;
    }
    public void setGiaSach(float giaSach){
        this.giaSach = giaSach;
    }
    public float getGiaSach(){
        return giaSach;
    }
    public void SetNXB(String NXB){
        this.NXB = NXB;
    }
    public String getNXB(){
        return NXB;
    }

    @Override
    public String toString() {
        return ("Ma sach: "+maSach+" Ten sach: "+tenSach+" Tac gia: "+tacGia.toString()+" Gia: "+giaSach+" NXB"+NXB); 
    }
    

}
