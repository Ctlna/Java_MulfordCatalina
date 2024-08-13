package ClaseAbstracta;

public class Main {

    //Definicion:Una clase abstracta es una clase que no
    // se puede instanciar directamente.
    // Puede contener métodos abstractos (sin implementación)
    // y métodos concretos (con implementación).
    // Las clases abstractas se utilizan para definir una
    // base común para un grupo de clases relacionadas y permiten compartir
    // código común entre esas clases.
    public static void main(String[] args) {
        Dog dog = new Dog("Pepe");
        dog.sleep();
        dog.sound();

        Cat cat = new Cat("Michifus");
        cat.sleep();
        cat.sound();
    }
}
