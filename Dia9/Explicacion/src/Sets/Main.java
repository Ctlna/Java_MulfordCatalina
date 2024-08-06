package Sets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        try{
            set.add("A");
            set.add("B");
            set.add("C");
            set.add("D");
            set.add("E");
            System.out.println("Set de A: "+set.contains("A"));
            set.remove("B");
            System.out.println(set);

        }
        catch (NullPointerException e){
            System.out.println("Cuidado, es un elemento nulo");
        }
        catch (Exception e){
            System.out.println("Excepcion general: "+e);
        }
    }
}
