/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package I;

/**
 *
 * @author Usuario
 */
public class Implementar_I {
    public static void main(String[] args) {
        Fruta_I.Manzana manzana = new Manzana();
        manzana.comer();
        manzana.pelar();
        Fruta_I.Banana banana = new Banana();
        banana.comer();
        banana.pelar(); 
    }
}
