package Ejemplo_incrementacion.InterrfazRunnable;

public class MyRunnable {
    @Override
    public void run (){
        for (int i = 0; i<5; i++){
            System.out.println("Ru7nnable - Iteración "+1);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
