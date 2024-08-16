package Ejemplo_incrementacion.InterrfazRunnable;

public class Main {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);

        thread.start();
    }
}
