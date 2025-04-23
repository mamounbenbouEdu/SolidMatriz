package domain;

public class Matriz {
    private final int[][] datos;

    public Matriz(int[][] datos) {
        if (datos == null || datos.length == 0 || datos[0].length == 0) {
            throw new IllegalArgumentException("La matriz no puede ser nula o vacía.");
        }
        this.datos = datos;
    }

    public int[][] getDatos() {
        return datos;
    }

    public int getFilas() {
        return datos.length;
    }

    public int getColumnas() {
        return datos[0].length;
    }
}
