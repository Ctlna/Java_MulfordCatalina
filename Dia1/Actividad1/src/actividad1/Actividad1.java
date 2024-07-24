/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad1;
import java.util.Scanner;
import static javax.swing.text.html.FormView.RESET;
/**
 *
 * @author camper
 */
public class Actividad1 {
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ls = new Scanner(System.in); 
        int ingreso;
        
        do{
            System.out.println("Ponga el numero de quien desea ingresar:");
            System.out.println("1. Trainer");
            System.out.println("2. Coordinador");
            System.out.println("3. Salir");
            ingreso = ls.nextInt();
            
            switch(ingreso){
                case 1:
                    int hacert;
                    System.out.println(BLUE + "           Trainer" );
                    System.out.println("Selecciona que deseas hacer:");
                    System.out.println("1. Ver grupos");
                    System.out.println("2. Ver salas y horarios");
                    System.out.println("3. Salir");
                    hacert = ls.nextInt();

                    switch (hacert){
                        case 1:
                            System.out.println("Se podra ver los grupos.\n");
                            break;
                        case 2:
                            System.out.println("Se podra ver las salas y horarios de los grupos.\n");
                            break;
                        case 3:
                            ls.close();
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opción invalida, el número ingreso es incorrecto\n");
                    }
                    
                    break;
                
                case 2:
                    int hacerc;
                    System.out.println(PURPLE+"           Coordinador");
                    System.out.println("Selecciona que deseas hacer:");
                    System.out.println("1. Ingresar / Editar estudiante ");
                    System.out.println("2. Crear y asignar rutas");
                    System.out.println("3. Salir");
                    hacerc = ls.nextInt();
                    
                    switch (hacerc){
                        case 1:
                            System.out.println("Se ingresara o editara un estudiante.\n");
                            break;
                        case 2:
                            System.out.println("Se Crearan, asignaran ó editar las rutas.\n");
                            break;
                        case 3:
                            ls.close();
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opción invalida, el número ingreso es incorrecto\n");
                    }

                    break;
                
                case 3:
                    ls.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Opción invalida, el número ingreso es incorrecto\n");
            }
        } while(true);
    }
    
}
