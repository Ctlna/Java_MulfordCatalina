package ClaseAbstracta;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    //Método Abstracto
    public abstract void sound();

    //Método Concreto
    public void sleep(){
        System.out.println("El "+name+ " está durmiendo.");
    }
}
