/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagramaligabaloncesto;

/**
 *
 * @author camper
 */
public class DiagramaLigaBaloncesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Partidos partido = new Partidos(
       "Azul",
       "Verde",
       0,
       1,
       "2024-01-12",
       "Activo"
       );
       
       System.out.println(partido.getEquipoLocal());
    }
    
}
