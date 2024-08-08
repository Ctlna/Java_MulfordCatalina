/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D;

/**
 *
 * @author Usuario
 */
public class Jugo {
    interface Exprimidor {
    void exprimir();
}

class ExprimidorManzana implements Exprimidor {
    @Override
    public void exprimir() {
        System.out.println("Exprimiendo una manzana.");
    }
}

class ExprimidorBanana implements Exprimidor {
    @Override
    public void exprimir() {
        System.out.println("Exprimiendo una banana.");
    }
}

class ProcesadorFrutas {
    private Exprimidor exprimidor;

    public ProcesadorFrutas(Exprimidor exprimidor) {
        this.exprimidor = exprimidor;
    }

    public void procesar() {
        exprimidor.exprimir();
    }
}
}
