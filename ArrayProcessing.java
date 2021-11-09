/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author MUHAMMADJULKARNAIN
 */
public class ArrayProcessing {
    // define variable to assign array length
    int n;
    // define or setups an array
    int[] array_angka;
    
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan banyaknya input data : ");
        this.n = input.nextInt();
        int[] array_bilangan = new int[n];
        
        // assign user input to an array 
        for(int i = 0; i < n; i++){
            System.out.println("Masukan bil ke-" + (i+1) + " : ");
            array_bilangan[i] = input.nextInt();
        }
        this.array_angka = array_bilangan;
        
    }
    
    double Hitung_Rerata(int[] array_angka){
        double sum = 0;
        for(int i = 0; i < array_angka.length; i++){
            sum += array_angka[i];
        }
        double rerata = sum / n;
        return rerata;
    }
    
    int Cari_Min(int[] array_angka) { // 2,3,1
        int minimum_value = array_angka[0];
        for(int i = 1; i < array_angka.length; i++){
            if(array_angka[i] < minimum_value){
                minimum_value = array_angka[i];
            }
        }
        return minimum_value;
    }
 
    int Cari_Max(int[] array_angka){ // 2,3,1
        int maximum_value = array_angka[0];
        for(int i = 1; i < array_angka.length; i++){
            if(array_angka[i] > maximum_value){
                maximum_value = array_angka[i];
            }            
        }
        return maximum_value;
    }
    
    static void Ascending_Sorting(int[] array_angka){
        for(int i = 0; i < array_angka.length; i++){
            for(int j = 0; j < array_angka.length-1; j++){
                if(array_angka[j] > array_angka[j+1]){
                    int temp = array_angka[j];
                    array_angka[j] = array_angka[j+1];
                    array_angka[j+1] = temp;
                }
            }
        }
        
    }
    
    void output() {    
        System.out.println("------- Output -------");
        System.out.println("Data             : " + Arrays.toString(array_angka));
        System.out.println("Data Length      : " + array_angka.length);
        System.out.println("Nilai Rata-Rata  : " + Hitung_Rerata(array_angka));
        System.out.println("Nilai minimum    : " + Cari_Min(array_angka));
        System.out.println("Milai maximum    : " + Cari_Max(array_angka));
        System.out.print("Hasil Sorting    : ");
        Ascending_Sorting(array_angka);
        for(int i = 0; i < n; i++){
            System.out.print(array_angka[i] +" ");
        }
    }  
}
