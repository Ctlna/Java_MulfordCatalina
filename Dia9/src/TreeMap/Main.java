package TreeMap;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args){
        TreeMap<String,Integer> map = new TreeMap<>();

        try {
            map.put("A",1);
            map.put("B",2);
            map.put("C",3);
            map.put("D",4);
            map.put("E",5);


            System.out.println("Valor de A: "+map.get("A"));
            map.remove("B");
            System.out.println("Valor de A: "+map.get("F"));
        }
        catch (NullPointerException e){
            System.out.println("Error de algo "+e);
        }
        catch (Exception e){
            System.out.println("Exception "+e);
        }
    }
}
