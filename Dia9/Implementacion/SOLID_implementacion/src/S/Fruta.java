/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S;

/**
 *
 * @author Usuario
 */
public class Fruta {
    private String nombre;
    private String color;
    
    public Fruta(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }
}

class RepositorioFrutas {
    public void guardarFruta(Fruta fruta) {
        // Lógica para guardar la fruta en la base de datos
        System.out.println("Guardando " + fruta.getNombre() + " en la base de datos.");
    }
}
