/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<>();
        nama.add("Ahmad");
        nama.add("Zulfa");
        nama.add("Bilqis");
        nama.add("Martis");
        
        String cari = nama.get(1); 
        System.out.println("Tampilkan: "+cari);
    }
}

