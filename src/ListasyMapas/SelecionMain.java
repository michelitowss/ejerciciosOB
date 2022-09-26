package ListasyMapas;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SelecionMain {
    public static void main(String[] args) {

        //En este ejemplo nos vamos a crear un TreeMap en la que la clave será el nombre del jugador
        // y el valor será un objeto de la clase "JugadorSeleccion".


        Map<String, JugadorSeleccion> jugadores = new TreeMap<String, JugadorSeleccion>();

        jugadores.put("Casillas", new JugadorSeleccion(1, "Casillas", "Portero"));
        jugadores.put("Ramos", new JugadorSeleccion(15, "Ramos", "Derecho"));
        jugadores.put("Pique", new JugadorSeleccion(3, "Pique", "Central"));
        jugadores.put("Puyol", new JugadorSeleccion(5, "Puyol", "Central"));
        jugadores.put("Capdevila", new JugadorSeleccion(11, "Capdevila", "Lateral Izquierdo"));
        jugadores.put("Aloonso", new JugadorSeleccion(14, "Xavi Alonso", "Medio CEntro"));
        jugadores.put("Busquets", new JugadorSeleccion(16, "Busquets", "Medio CEntro"));
        jugadores.put("Xavi", new JugadorSeleccion(8, "Xavi Hernandez", "Centro Campista"));
        jugadores.put("Pedrito ", new JugadorSeleccion(18, "Pedrito", "Interior Isquierdo"));
        jugadores.put("Iniesta", new JugadorSeleccion(6, "Iniesta", "Interior Derecho"));
        jugadores.put("Villa", new JugadorSeleccion(7, "Villa", "Delantero"));

        Iterator<String> it = jugadores.keySet().iterator();
        while (it.hasNext()) {
            System.out.println(jugadores.get(it.next()));
        }
        System.out.println("______________________");

        for (Map.Entry<String, JugadorSeleccion> jugador : jugadores.entrySet()) {
            String clave = jugador.getKey();
            JugadorSeleccion valor = jugador.getValue();
            System.out.println(clave + "  -> " + valor.toString());
            String mostrar = String.valueOf(jugadores.get("Capdevila"));
            System.out.println(mostrar);

        }


    }
}
