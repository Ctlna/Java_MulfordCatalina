package LSP.Good;

public class Penguinn extends Bird{
    @Override
    public void move(){
        slide();
    }

    public void slide(){
        System.out.println("Me deslizo");
    }
}
