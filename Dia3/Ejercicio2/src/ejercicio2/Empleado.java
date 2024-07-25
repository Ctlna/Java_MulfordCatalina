/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;
import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.

/**
 *
 * @author camper
 */
public class Empleado {
    private int id;
    private String nombre;
    private LocalDateTime fechaVinculacion;
    private float salario;
    
    public Empleado(int id,String nombre,LocalDateTime fechaVinculacion,float salario){
        this.nombre=nombre;
        this.id=id;
        this.fechaVinculacion=fechaVinculacion;
        this.salario=salario;
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
    
    public LocalDateTime getFechaVinculacion(){
        return fechaVinculacion;
    }
    public void setFechaVinculacion(LocalDateTime fechaVinculacion){
        this.fechaVinculacion=fechaVinculacion;
    }
    
    public float getSalario(){
        return salario;
    }
    public void setSalario(float salario){
        this.salario=salario;
    }
}
