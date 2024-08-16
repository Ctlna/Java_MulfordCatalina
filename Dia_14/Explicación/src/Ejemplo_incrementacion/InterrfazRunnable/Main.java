package Ejemplo_Implementacion.InterrfazRunnable;

public class Main {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);

        thread.start();
    }
}
