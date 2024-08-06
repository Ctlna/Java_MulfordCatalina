package Mapas;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        try{
            map.put("A",1);
            map.put("B",2);
            map.put("C",3);
            System.out.println("Valor asociado a: "+map.get("A"));
            map.remove("B");
            System.out.println(map);
        }
        catch(NullPointerException e){
            System.out.println("Se accedio con una clave nula, ten cuidado");
        }
        catch (Exception e){
            System.out.println("Excepcion general: "+e);
        }
    }
}