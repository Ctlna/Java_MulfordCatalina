/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package I;

/**
 *
 * @author Usuario
 */
public class Fruta_I {
    interface Comedor {
    void comer();
}

interface Pelador {
    void pelar();
}

class Manzana implements Comedor, Pelador {
    @Override
    public void comer() {
        System.out.println("Comiendo una manzana.");
    }

    @Override
    public void pelar() {
        System.out.println("Pelando una manzana.");
    }
}

// Clase Banana que implementa ambas interfaces
class Banana implements Comedor, Pelador {
    @Override
    public void comer() {
        System.out.println("Comiendo una banana.");
    }

    @Override
    public void pelar() {
        System.out.println("Pelando una banana.");
    }
}
}
