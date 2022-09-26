package ListasyMapas;

import java.util.Map;
import java.util.TreeMap;

public class FrutasMain {
    public static void main(String[] args) {
        Map<String,Frutas> fruit = new TreeMap<String, Frutas>();

        fruit.put("Platano", new Frutas("Platano","amarillo",1400));
        fruit.put("Pera", new Frutas("Pera","Verde",1200));
        fruit.put("Limon", new Frutas("Limon","amarillo",1000));
        fruit.put("Manzana", new Frutas("Manzana","Rojo",800));
        fruit.put("Kiwi", new Frutas("Kiwi","verde",1500));

        //creamos un ciclo for each en el cual especificamos la clase Map.Entry para recorrer el mapa
        //Creamos una variable que solo se vera en el ciclo for "frutitas", y luego recorremos el mapo diccionario
        //con : variable.entrySet() ->
        for (Map.Entry<String,Frutas> frutitas : fruit.entrySet()) {
            //creamos una variable temporal para guardar la clave donde valla el iterador
            String valor = frutitas.getKey();
            //creamos una variable temporal para guardar el valor donde valla el iterador
            String valor2 = String.valueOf(frutitas.getValue()); //Java String valueOf () devuelve la representación
            // de cadena de los argumentos boolean, char, char array, int, long, float y double.
            System.out.println(valor + "  ->  " + valor2);

        }
    }
}
