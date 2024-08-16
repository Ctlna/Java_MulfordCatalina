/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo_incrementacion.ExtendThread;

/**
 *
 * @author camper
 */
public class Mythread extends Thread {
    @Override
    public void run (){
        for (int i = 0; i<5; i++){
            System.out.println("Hilo "+this.getName()+": Iteración "+1);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
        }
    }

