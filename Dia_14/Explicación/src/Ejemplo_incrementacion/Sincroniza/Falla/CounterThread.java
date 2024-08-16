package Ejemplo_incrementacion.Sincroniza.Falla;

public class CounterThread extends Thread{
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter=counter;
    }

    @Override
    public void run() {
        for (int = 0; int < 1000; i++){
            counter.increment();


        }
    }
}
