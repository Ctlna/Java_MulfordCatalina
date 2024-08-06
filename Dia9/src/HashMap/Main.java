package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap<String,Integer> hashMap = new HashMap<>();
        // Tiene dos cositas, la capacidad y la carga

        try{
            hashMap.put("A",1);
            hashMap.put("B",2);
            hashMap.put("C",3);
            hashMap.put("D",4);

            System.out.println("Valor asociar A: "+hashMap.get("A"));
            hashMap.remove("B");

            System.out.println(hashMap.get("E"));

        }
        catch (NullPointerException e){
            System.out.println("Error por falta de puntero "+e);
        }
        catch (Exception e) {
            System.out.println("Exception "+e);
        }
    }
}
