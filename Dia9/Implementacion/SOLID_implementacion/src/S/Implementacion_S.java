/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S;

/**
 *
 * @author Usuario
 */
public class Implementacion_S {
    public static void main(String[] args) {
        Fruta manzana = new Fruta("Manzana", "Rojo");
        RepositorioFrutas repositorioFrutas = new RepositorioFrutas();
        repositorioFrutas.guardarFruta(manzana);
    }
}
