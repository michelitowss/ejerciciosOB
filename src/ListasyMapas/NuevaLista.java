package ListasyMapas;

import java.util.ArrayList;
import java.util.List;

public class NuevaLista {
    public static void main(String[] args) {

        List<String> frut = new ArrayList<String>();

        frut.add("Mandarina");
        frut.add("Platano");
        frut.add("Manzana");

        System.out.println(frut);
        System.out.println("----------------------------------------------------------------");

        for (String i : frut) {
            System.out.println(i);
        }
        System.out.println("______________________");
        List<Frutas> f = new ArrayList<Frutas>();
        f.add(new Frutas("Mandarina", "Naranja", 900));
        f.add(new Frutas("Papaya", "Amarillo", 1800));
        f.add(new Frutas("Melon", "Verde", 2500));

        System.out.println(f);
        System.out.println("______________________");

        for (Frutas fr : f) {
            System.out.println(fr);

        }


    }
}
