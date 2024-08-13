package Interfaces;

public class Main {
    //Definicion:Una interfaz es una colección de métodos abstractos
    // que una clase puede implementar.
    // A partir de Java 8, las interfaces también pueden contener
    // métodos predeterminados (default) con implementación y métodos estáticos.
    // Las interfaces definen un contrato que las
    // clases que las implementan deben cumplir, pero no
    // pueden contener estado (no pueden tener variables de instancia, excepto las constantes).
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sleep();

        cat.sleep();
        dog.sound();
        cat.sound();
    }
}
