package Ejemplo3_polimorfismo;

public class Main {
    public static void main(String[] args){
        Animal perro = new Perro();
        Animal gato = new Gato();

        perro.hacerSonido();
        gato.hacerSonido();

    }
}
