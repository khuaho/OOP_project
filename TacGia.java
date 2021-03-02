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
public class TacGia {
    private String tenTacGia;
    private char GioiTinh;
    
    public TacGia(){
        
    }
    public TacGia(String tenTacGia, char GioiTinh){
        this.tenTacGia = tenTacGia;
        this.GioiTinh = GioiTinh;
    }
    public void settenTacGia(String tenTacGia){
        this.tenTacGia = tenTacGia;
    }
    public String getTenTacGia(){
        return tenTacGia;
    }
    public void setGioiTinh(char GioiTinh){
        this.GioiTinh = GioiTinh;
    }
    public char getGioiTinh(){
        return GioiTinh;
    }

    @Override
    public String toString() {
        return ("[Ten tac gia: "+tenTacGia+" - Gioi tinh: "+GioiTinh+" ]");
    }
    

}
