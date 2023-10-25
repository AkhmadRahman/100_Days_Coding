/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

/**
 *
 * @author USER
 */
import java.util.Stack;
public class Structure_stack {
    public static void main(String[] args) {
        Stack<String> mila = new Stack<>();
        mila.push("Ahmad Rahman");
        mila.push("Andi Rahmat");
        mila.push("NurSakina Mawardi Anggela Sungkimen Dahlia Ponngo");
        mila.push("Dela Madela");
        String terakhir = mila.pop();
        System.out.println(""+terakhir);
    }
}
