package DIP.Good;

public class LightBulb implements Switchable {
    public void turnOn() {
        System.out.println("Ilumino más que tu futuro");
    }


    public void turnOff() {
        System.out.println("Me apague...");
    }
}
