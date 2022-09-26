package ListasyMapas;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Michel");
        nombres.add("Celeste");
        nombres.add("Michael");
        nombres.add("Karen");
        nombres.add("Johannes");

        for (String n : nombres) {
            System.out.println(n);
        }
        System.out.println("______________________");

        List<Double> nota = new ArrayList<>();
        nota.add(1.0);
        nota.add(2.0);
        nota.add(3.0);
        nota.add(4.0);

        for (Double n : nota) {
            System.out.println(n);

        }
        System.out.println("______________________");
    List<Integer> promedio = new ArrayList<Integer>();
        promedio.add(1);
        promedio.add(2);
        promedio.add(3);
        promedio.add(4);
        promedio.add(5);

        for (Integer n : promedio) {
            System.out.println(n);
        }
    //List<coche> coches = new ArrayList<>();
      //  coches.add(new coche("Nissan"));
        //coches.add(new coche("Ford"));
        //coches.add(new coche("Toyota"));
        //coches.add(new coche("Changan"));
        //coches.add(new coche("Alfa Romeo"));

    //for (coche name :coches){
      //  System.out.println(name);
   //}

    }
}
