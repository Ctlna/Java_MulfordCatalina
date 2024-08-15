/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia13;

/**
 *
 * @author camper
 */
public class Atleta extends Carrera {
    protected int Corredor1;
    protected int Corredor2;
    protected int Corredor3;
    protected int Corredor4;

    public Atleta(int Corredor1, int Corredor2, int Corredor3, int Corredor4) {
        this.Corredor1 = Corredor1;
        this.Corredor2 = Corredor2;
        this.Corredor3 = Corredor3;
        this.Corredor4 = Corredor4;
    }

    public int getCorredor1() {
        return Corredor1;
    }

    public void setCorredor1(int Corredor1) {
        this.Corredor1 = Corredor1;
    }

    public int getCorredor2() {
        return Corredor2;
    }

    public void setCorredor2(int Corredor2) {
        this.Corredor2 = Corredor2;
    }

    public int getCorredor3() {
        return Corredor3;
    }

    public void setCorredor3(int Corredor3) {
        this.Corredor3 = Corredor3;
    }

    public int getCorredor4() {
        return Corredor4;
    }

    public void setCorredor4(int Corredor4) {
        this.Corredor4 = Corredor4;
    }
    
    public void run(){
        
    }
}
