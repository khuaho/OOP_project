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
public class SinhVien {
    private String IDStudent;
   private String ReaderName;
   private String classStudent;
   private String gmail;
   
   public SinhVien(){
       
   }
   public SinhVien(String IDStudent, String ReaderName, String classStudent, String gmail){
       this.IDStudent = IDStudent;
       this.ReaderName = ReaderName;
       this.classStudent = classStudent;
       this.gmail = gmail;
   }
   public void setID(String IDStudent){
       this.IDStudent = IDStudent;
   }
   public String getID(){
       return IDStudent;
   }
   public void setReaderName(String ReaderName){
       this.ReaderName = ReaderName;
   }
   public String getReaderName(){
       return ReaderName;
   }
   public void setClassStudent(String classStudent){
       this.classStudent = classStudent;
   }
   public String getClassStudent(){
       return classStudent;
   }
   public void setMail(String gmail){
       this.gmail = gmail;
   }
   public String getMail(){
       return gmail;
   }
   
   

    @Override
    public String toString() {
        return ("Ma SV: "+IDStudent+" Ten sinh vien: "+ReaderName+" Lop: "+classStudent+" Gmail: "+gmail);
    }

}
