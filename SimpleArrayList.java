/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author MUHAMMADJULKARNAIN
 */
public class SimpleArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayProcessor arr = new ArrayProcessor();
        while(true){
            int user_input;
            System.out.println("");
            System.out.println("---- ArrayList Program ----");
            System.out.println("1 Tambah data");
            System.out.println("2 Cari Data");
            System.out.println("3 Hapus Data");
            System.out.println("4 Tampil Data");
            System.out.println("5 Keluar");
            
            Scanner input = new Scanner(System.in);
            System.out.println("");
            System.out.println("Pilih Menu :  ");
            user_input = input.nextInt();

            switch (user_input) {
                case 1:
                    arr.Tambah_Data();
                    break;
                case 2:
                    arr.Cari_Data();
                    break;
                case 3:
                    arr.Hapus_Data();
                    break;
                case 4:
                    arr.Tampil_Data();
                    break;
                case 5:
                    // quit the program
                    System.exit(0);
            }
        }
    }
    
}
