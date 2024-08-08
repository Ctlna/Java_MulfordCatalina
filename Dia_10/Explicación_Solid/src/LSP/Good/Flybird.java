package LSP.Good;

public class Flybird extends Bird {
    @Override
    public void move(){
        fly();
    }

    public void fly() {
        System.out.println("Volandinggg");
    }
}
