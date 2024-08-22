package logico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cartera implements PatronCartera{
    Scanner sc = new Scanner(System.in);
    private String anho;
    private List<Tarjeta> tarjeta;

    public Cartera(String anho) {
        this.anho = anho;
        tarjeta = new ArrayList<>();
    }

    public Cartera(Object filename, List<Tarjeta> list) {
    }

    public String getAnho() {
        return anho;
    }

    public void setAnho(String anho) {
        this.anho = anho;
    }

    public List<Tarjeta> getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(List<Tarjeta> tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public void imprimirListaDeTarjetas() {
        System.out.println("********* Balanece del "+anho+"**********");
        for(Tarjeta tarjeta: tarjeta){
            System.out.println(tarjeta.info());
        }
    }

    @Override
    public void agregarTarjeta(Tarjeta t) {
        tarjeta.add(t);
    }
}