package ListasyMapas;

public class JugadorSeleccion {

    private int dorsal;
    private String nombre;
    private String demarcacion;

    public JugadorSeleccion() {
    }

    public JugadorSeleccion(int dorsal, String nombre, String demarcacion) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.demarcacion = demarcacion;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "  " +dorsal +"  --  " + nombre  +"  --  " + demarcacion ;
    }
}
