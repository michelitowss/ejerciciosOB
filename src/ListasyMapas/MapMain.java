package ListasyMapas;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> personas = new HashMap<>();
        personas.put("15680607-2", "Michel Montero");
        personas.put("17302494-0", "Karen Rodriguez");
        personas.put("24552874-4", "CEleste montero");

        System.out.println(personas);
        // Nos entrega el valor del ID solo de este campo
        for (String key : personas.keySet()) {
            System.out.println(key);
        }
        // Nos entrega el valor solo del nombre segundo campo
        for (String valor : personas.values()) {
            System.out.println(valor);
        }
        // Nos entrega ambos valores primer y segundo campo
        for (Map.Entry<String, String> entry : personas.entrySet()) {
            System.out.println(entry.getKey() + " // " + entry.getValue());
        }
        /*

        Declaración de un Map (un HashMap) con clave "Integer" y Valor "String". Las claves pueden ser de cualquier tipo de objetos, aunque los más utilizados como clave son los objetos predefinidos de Java como String, Integer, Double ... !!!!CUIDADO los Map no permiten datos atómicos
        Map<Integer, String> nombreMap = new HashMap<Integer, String>();
        nombreMap.size(); // Devuelve el numero de elementos del Map
        nombreMap.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
        nombreMap.put(K clave, V valor); // Añade un elemento al Map
        nombreMap.get(K clave); // Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
        nombreMap.clear(); // Borra todos los componentes del Map
        nombreMap.remove(K clave); // Borra el par clave/valor de la clave que se le pasa como parámetro
        nombreMap.containsKey(K clave); // Devuelve true si en el map hay una clave que coincide con K
        nombreMap.containsValue(V valor); // Devuelve true si en el map hay un Valor que coincide con V
        nombreMap.values(); // Devuelve una "Collection" con los valores del Map

         */
        System.out.println("_______________________________");

        /*
        HashMap: Los elementos que inserta en el map no tendrán un orden específico.
        No aceptan claves duplicadas ni valores nulos.
         */

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put((1), "Casillas");
        map.put((15), "Ramos");
        map.put((3), "Pique");
        map.put((5), "Puyol");
        map.put((11), "Capdevila");
        map.put((14), "Xavi Alonso");
        map.put((16), "Busquets");
        map.put((8), "Xavi Hernandez");
        map.put((18), "Pedrito");
        map.put((6), "Iniesta");
        map.put((7), "Villa");

        System.out.println("_______________________________");
        //Imprimimos el map con Iterator

        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Integer id = (Integer) it.next();
            System.out.println("Clave: " + id + "-> Valor: " + map.get(id));
        }
        /*
        TreeMap: El Mapa lo ordena de forma "natural".
        Por ejemplo, si la clave son valores enteros
        (como luego veremos), los ordena de menos a mayor.
         */
        Map<Integer, String> i = new TreeMap<Integer, String>();
        i.put(1, "Casillas");
        i.put(15, "Ramos");
        i.put(3, "Pique");
        i.put(5, "Puyol");
        i.put(11, "Capdevila");
        i.put(14, "Xavi Alonso");
        i.put(16, "Busquets");
        i.put(8, "Xavi Hernandez");
        i.put(18, "Pedrito");
        i.put(6, "Iniesta");
        i.put(7, "Villa");

        //Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
        it = i.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + "-> Valor: " + i.get(key));
        }

        System.out.println("********* Trabajando con los métodos de TreeMap *********");
        System.out.println("Mostramos el numero de elementos que tiene el TreeMap: treeMap.size() = "+ i.size());
        System.out.println("Vemos si el TreeMap esta vacio : treeMap.isEmpty() = "+ i.isEmpty());
        System.out.println("Obtenemos un elemento del Map pasandole la clave 6: treeMap.get(6) = "+ i.get(6));
        System.out.println("Borramos un elemento del Map el 18 (porque fue sustituido): treeMap.remove(18)"+ i.remove(18));
        System.out.println("Vemos que pasa si queremos obtener la clave 18 que ya no existe: treeMap.get(18) = "+ i.get(18));
        System.out.println("Vemos si existe un elemento con la clave 18: treeMap.containsKey(18) = "+ i.containsKey(18));
        System.out.println("Vemos si existe un elemento con la clave 1: treeMap.containsKey(1) = "+ i.containsKey(1));
        System.out.println("Vemos si existe el valo 'Villa' en el Map: treeMap.containsValue(Villa) = " + i.containsValue("Villa"));
        System.out.println("Vemos si existe el valo 'Ricardo' en el Map: treeMap.containsValue(Ricardo) = "+ i.containsValue("Ricardo"));
        System.out.println("Borramos todos los elementos del Map: treeMap.clear()"); i.clear();
        System.out.println("Comprobamos si lo hemos eliminado viendo su tamaño: treeMap.size() = "+ i.size());
        System.out.println("Lo comprobamos tambien viendo si esta vacio treeMap.isEmpty() = "+ i.isEmpty());
        System.out.println("______________________");
        /*
        LinkedHashMap: Inserta en el Map los elementos en el orden en el que se van insertando;
        es decir, que no tiene una ordenación de los elementos como tal,
        por lo que esta clase realiza las búsquedas de los elementos de forma más lenta que las demás clases.
         */

        Map<Integer, String> j = new LinkedHashMap<>();
        j.put(1, "Casillas");
        j.put(15, "Ramos");
        j.put(3, "Pique");
        j.put(5, "Puyol");
        j.put(11, "Capdevila");
        j.put(14, "Xavi Alonso");
        j.put(16, "Busquets");
        j.put(8, "Xavi Hernandez");
        j.put(18, "Pedrito");
        j.put(6, "Iniesta");
        j.put(7, "Villa");

        //Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente

        it = j.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + "-> Valor: " + j.get(key));
        }


    }
}
