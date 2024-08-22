package persistencia;

import logico.Joven;
import logico.Nomina;
import logico.Tarjeta;
import logico.Visa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LecturaEscritura {
    private BufferedReader reader;
    private BufferedWriter writer;
    private String filename;
    private List<Tarjeta> list;

    public LecturaEscritura(String nombreArchivo){
        this.filename = nombreArchivo;
        list= new ArrayList<>();
    }

    public List<Tarjeta> getList(){
        return list;
    }

    public void setFileName(String filename){
        this.filename = filename;
    }

    public void leerTarjetas(){
        Scanner sc = new Scanner(System.in);
        try {
            reader = new BufferedReader(new FileReader("archivos/"+this.filename+".txt"));
            String line = reader.readLine();
            while (line!=null){
                String[] datos = line.split(";");
                switch (datos[2]){
                    case "Joven" -> list.add(new Joven(datos[0],Double.parseDouble(datos[1]),this.filename));
                    case "Nomina" -> list.add(new Nomina(datos[0],Double.parseDouble(datos[1]),this.filename));
                    case "Visa" -> list.add(new Visa(datos[0],Double.parseDouble(datos[1]),this.filename));
                    default -> {}
                }
                line =reader.readLine();
            }
            reader.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void escribirTarjetas(List<Tarjeta> tarjetas){
        try{
            writer = new BufferedWriter(new FileWriter("archivos/reporte.txt"));
            for(Tarjeta tarjeta : tarjetas){
                writer.write(tarjeta.toString()+"\n");
            }
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Object getFilename() {
        return null;
    }
}
