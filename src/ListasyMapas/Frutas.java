package ListasyMapas;

public class Frutas {

    String fruta;
    String color;
    Integer valor;

    public Frutas(String fruta, String color, Integer valor) {
        this.fruta = fruta;
        this.color = color;
        this.valor = valor;
    }

    public String getFruta() {
        return fruta;
    }

    public String getColor() {
        return color;
    }

    public Integer getValor() {
        return valor;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return fruta + " -- " +
                color + " -- " +
                valor;

    }
}
