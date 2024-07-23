/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 *
 * @author camper
 */
public class Camper {
    private String identificacion;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String acudiente;
    private String celular;
    private String fijo;
    private String estado;
    private String riesgo;
    
    public Camper(  String identificacion,String nombre,String apellidos,String direccion,
                    String acudiente,String celular,String fijo,String estado, 
                    String riesgo){
        this.identificacion=identificacion;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.direccion=direccion;
        this.acudiente=acudiente;
        this.celular=celular;
        this.fijo=fijo;
        this.estado=estado;
        this.riesgo=riesgo;
    }
    
    public String getIdentificaion(){
        return identificacion;
    }
    public void setIdentificaion(String identificacion){
        this.identificacion=identificacion;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    
    public String getAcudiente(){
        return acudiente;
    }
    public void setAcudiente(String acudiente){
        this.acudiente=acudiente;
    }
    
    public String getCelular(){
        return celular;
    }
    public void setCelular(String celular){
        this.celular=celular;
    }
    
    public String getFijo(){
        return fijo;
    }
    public void setFijo(String fijo){
        this.fijo=fijo;
    }
    
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
    
    public String getRiesgo(){
        return riesgo;
    }
    public void setRiesgo(String riesgo){
        this.riesgo=riesgo;
    }

    @Override
    public String toString(){
        return 
                "\n Identificacion = "+ identificacion+
                "\n Nombre = "+ nombre + 
                "\n Apellidos = "+ apellidos +
                "\n Direccion = "+ direccion +
                "\n Acudiente = "+ acudiente +
                "\n Celular = "+ celular +
                "\n Telefono fijo = "+ fijo +
                "\n Estado = "+ estado +
                "\n Riesgo = "+ riesgo;
    }
}