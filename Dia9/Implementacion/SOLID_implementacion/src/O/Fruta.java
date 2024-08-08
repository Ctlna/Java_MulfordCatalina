/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author Usuario
 */
abstract class Fruta {
    abstract double getPeso();
}

class Manzana extends Fruta {
    private double peso;

    public Manzana(double peso) {
        this.peso = peso;
    }

    @Override
    double getPeso() {
        return peso;
    }
}

class Banana extends Fruta {
    private double peso;

    public Banana(double peso) {
        this.peso = peso;
    }

    @Override
    double getPeso() {
        return peso;
    }
}