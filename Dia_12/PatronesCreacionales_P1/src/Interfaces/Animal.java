package Interfaces;

public interface Animal {
    //Método Abstracto
    public void sound();

    //Método por defecto
    default void sleep(){
        System.out.println("El animal está durmiendo.");
    }
}
