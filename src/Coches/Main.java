package Coches;

public class Main {
    public static void main(String[] args) {

        String[] nombres = new String[]{"Michel", "KAren", "Celeste", "Manchas"};

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        String apellidos1 = "Montero";
        String apellidos2 = "ROdriguez";
        String apellidos3 = "Piñones";
        String apellidos4 = "Layana";

        String[] apellidos = new String[4];

        apellidos[0] = apellidos1;
        apellidos[1] = apellidos2;
        apellidos[2] = apellidos3;
        apellidos[3] = apellidos4;

        for (int i = 0; i < apellidos.length; i++) {
            System.out.println(apellidos[i]);
        }

    }

}