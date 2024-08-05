/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramaligabaloncesto;

/**
 *
 * @author camper
 */
public class Liga {
    protected int Jornada;

    public Liga(){}
    public Liga(int Jornada){
        this.Jornada=Jornada;
    }
    
    public int getJornada(){
        return Jornada;
    }
    public void setJornada(int Jornada){
        this.Jornada=Jornada;
    }
}
