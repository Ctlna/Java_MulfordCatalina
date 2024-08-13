package SINGLETON;

public class SingletonExample {

    //Definición: El Singleton es un patrón que asegura
    // que una clase tenga una única instancia y proporciona
    // un punto global de acceso a dicha instancia.
    public static void main(String[] args) {
        Configuration config1 = Configuration.getInstance();
        Configuration config2 = Configuration.getInstance();

        System.out.println(config1.getConfigValue());
        config1.setConfigValue("Nueva configuración.");
        System.out.println(config2.getConfigValue());
    }
}
