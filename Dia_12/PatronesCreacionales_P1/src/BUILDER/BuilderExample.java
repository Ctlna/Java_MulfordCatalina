package BUILDER;

public class BuilderExample {
    //Definicion: Builder es un patrón que separa
    // la construcción de un objeto complejo de su representación,
    // permitiendo que el mismo proceso de construcción pueda crear representaciones diferentes.
    public static void main(String[] args) {
        Director director = new Director();
        ComputerBuilder builder = new GamingComputerBuilder();

        director.setComputerBuilder(builder);
        director.constructComputer();

        Computer computer = director.getComputer();
        System.out.println(computer);
    }
}
