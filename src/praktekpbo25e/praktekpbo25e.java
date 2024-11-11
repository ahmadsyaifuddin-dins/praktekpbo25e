/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktekpbo25e;

import crudDB.crudDB;
import forms.MainForm;
import javax.swing.JOptionPane;

public class praktekpbo25e {
    
    public static void main(String[] args) {
        crudDB myobject = new crudDB();
                
        
        new MainForm().setVisible(true);

//        // Menggunakan array untuk field dan isinya
//        String[] fieldTabel = {"KodeDVD", "Judul", "genre", "stok", "tahun"};
//        String[] isifieldTabel = {"RO4", "Venom", "Action", "100", "2002"};
//        
//        // Cek apakah kunci duplikat ada
//        if (myobject.DuplicateKey("dvd", "KodeDVD", "RO4")) {
//            JOptionPane.showMessageDialog(null, "Kode DVD sudah ada");
//        } else {
//            // Simpan data jika tidak ada duplikat
//            myobject.simpanDinamis("dvd", fieldTabel, isifieldTabel);
//        }
    }
}

    
//    public static void main(String[] args) {
//    crudDB myobject = new crudDB();
//    if (myobject.DuplicateKey("Anggota","IDAnggota","ID01")){
//            JOptionPane.showInternalMessageDialog(null, "ID sudah terdaftar");
//    } else {
//    JOptionPane.showInternalMessageDialog(null, "ID Belum terdaftar");
//    }
//}
 