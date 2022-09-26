package Coches;

public class coche {

    String name = "Nombre del Coches.coche";

    public coche() {
    }

    public coche(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Coches.coche{" +
                "name='" + name + '\'' +
                '}';
    }


}
