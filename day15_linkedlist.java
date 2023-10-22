/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author USER
 */
import java.util.LinkedList;
public class LinkedList {
    public static void main(String[] args) {
        LinkedList <Integer> aku = new LinkedList<>();
        aku.add(10);
        aku.add(20);
        aku.add(30);
        
        int nilai = aku.getFirst();
        System.out.println("Nilai Yang Diambil Adalah: "+ nilai);

    }
}
