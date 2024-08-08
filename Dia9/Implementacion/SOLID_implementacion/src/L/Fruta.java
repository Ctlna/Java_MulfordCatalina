/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L;

/**
 *
 * @author Usuario
 */
public class Fruta {
    
        public String sabor() {
        return "Sabor general";
    }
    }

class Manzana extends Fruta {
    @Override
    public String sabor() {
        return "Dulce y crujiente";
    }
}

class Banana extends Fruta {
    @Override
    public String sabor() {
        return "Dulce y suave";
    }
    }
