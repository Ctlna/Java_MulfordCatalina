package ISP.Good;

public class HumanWorker implements Worker,Eater{
    public void eat(){
        System.out.println("Tengo hambre");
    }

    public void work() {
        System.out.println("Morire por java");
    }
}
