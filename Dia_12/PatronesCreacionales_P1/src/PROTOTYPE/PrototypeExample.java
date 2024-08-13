package PROTOTYPE;

public class PrototypeExample {
    //Definicion: El Prototype es un patrón que se utiliza para crear nuevos objetos copiando
    // una instancia existente, conocida como prototipo.
    // Este patrón es útil cuando la creación de un objeto es costosa o compleja.
    public static void main(String[] args) {
        Document original = new Document("Este es el contenido original");
        Document copia = (Document) original.clone();

        System.out.println(original);
        System.out.println(copia);
    }
}
