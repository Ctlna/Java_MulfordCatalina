/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D;

/**
 *
 * @author Usuario
 */
public class Implementa_D {
    public static void main(String[] args) {
        Jugo.Exprimidor exprimidorManzana = new ExprimidorManzana();
        Jugo.ProcesadorFrutas procesador1 = new ProcesadorFrutas(exprimidorManzana);
        procesador1.procesar();

        Jugo.Exprimidor exprimidorBanana = new ExprimidorBanana();
        Jugo.ProcesadorFrutas procesador2 = new ProcesadorFrutas(exprimidorBanana);
        procesador2.procesar();
    }
}
