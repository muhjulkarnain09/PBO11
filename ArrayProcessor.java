/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;
import java.util.ArrayList; // import ArrayList class
import static java.util.Collections.binarySearch;
import java.util.Scanner;
/**
 *
 * @author MUHAMMADJULKARNAIN
 */
public class ArrayProcessor {
    // create an ArrayList Object
    ArrayList<String> arr = new ArrayList<>();
    // define input object
    Scanner input = new Scanner(System.in);
    
    // add method
    void Tambah_Data(){
        System.out.println("Masukan Data String : ");
        arr.add(input.nextLine());
        System.out.println("String di ArrayList : " + arr);
    }
    
    // search
    void Cari_Data(){
        System.out.println("Masukan String yg dicari : ");
        String key = input.nextLine();
        
        if(binarySearch(arr, key) > -1 ){
            System.out.println("String " + key + " ada di index ke " + binarySearch(arr, key));
        } else {
            System.out.println("String " + key + " tidak ditemukan");
        }
    }
    
    // delete 
    void Hapus_Data(){
        System.out.println("Masukan data yang akan di hapus : ");
        String data_terhapus = input.nextLine();
        
        if(binarySearch(arr, data_terhapus) > -1){
            arr.remove(binarySearch(arr, data_terhapus));
            System.out.println("String " + data_terhapus + " berhasil di hapus");
        } else {
            System.out.println("String " + data_terhapus + " tidak ditemukan");
        }
    }
    
    // view 
    void Tampil_Data() {
        System.out.println("String Array List : " + arr);
    }
}
