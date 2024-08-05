/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramaligabaloncesto;

import java.util.Date;

/**
 *
 * @author camper
 */
public class Partidos {
    protected String EquipoLocal;
    protected String EquipoVisitante;
    protected int CestasLocal;
    protected int CestasVisitante;
    protected String Fecha;
    protected String Estado;
    
    public Partidos(){}
    
    public Partidos (String EquipoLocal, String EquipoVisitante, int CestasLocal, int CestasVisitante
                     , String Fecha, String Estado){
        this.EquipoLocal=EquipoLocal;
        this.EquipoVisitante=EquipoVisitante;
        this.CestasLocal=CestasLocal;
        this.CestasVisitante=CestasVisitante;
        this.Fecha=Fecha;
        this.Estado=Estado;
    }
    public String getEquipoLocal(){
        return EquipoLocal;
    }
    public void setEquipoLocal(String EquipoLocal){
        this.EquipoLocal=EquipoLocal;
    }
    public String getEquipoVisitante(){
        return EquipoVisitante;
    }
    public void setEquipoVisitante(String EquipoVisitante){
        this.EquipoVisitante=EquipoVisitante;
    }
    public int getCestasLocal(){
        return CestasLocal;
    }
    public void setCestasLocal(int CestasLocal){
        this.CestasLocal=CestasLocal;
    }
    public int getCestasVisitante(){
        return CestasVisitante;
    }
    public void setCestasVisitante(int CestasVisitante){
        this.CestasVisitante=CestasVisitante;
    }
    public String getFecha(){
        return Fecha;
    }
    public void setFecha(String Fecha){
        this.Fecha=Fecha;
    }
    public String getEstado(){
        return Estado;
    }
    public void setEstado(String Estado){
        this.Estado=Estado;
    }
}
