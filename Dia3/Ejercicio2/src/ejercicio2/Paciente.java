/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;
import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
//import java.time.format.*;  // Este paquete contiene DateTimeFormatter.
/**
 *
 * @author camper
 * 
        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);
 */
public class Paciente {
    private int id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private LocalDateTime fechaIngreso;
    
    public Paciente(int id,String nombre,LocalDate fechaNacimiento,LocalDateTime fechaIngreso){
        this.nombre=nombre;
        this.id=id;
        this.fechaNacimiento=fechaNacimiento;
        this.fechaIngreso=fechaIngreso;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public LocalDate getfechaNacimiento(){
        return fechaNacimiento;
    }
    public void setfechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento=fechaNacimiento;
    }
    
    public LocalDateTime getFechaIngreso(){
        return fechaIngreso;
    }
    public void setFechaIngreso(LocalDateTime fechaIngreso){
        this.fechaIngreso=fechaIngreso;
    }
}
