package ISP.Bad;

public class RobotWorker implements Worker{
    public void produce() {
        System.out.println("Trabajo");
    }

    public void eat() {
        throw new UnsupportedOperationException("Pa que tengo esta función");
    }
}
