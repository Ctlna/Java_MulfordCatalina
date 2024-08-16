package Ejemplo_incrementacion.Sincroniza.Falla;

public class Main {
    public static void main(String[]args){
        Counter counter = new Counter();

        Thread thread1 = new CounterThread(counter);
        Thread thread2 = new CounterThread(counter);

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Contador final (No sincronizado): "+counter.getCount());
    }
}
