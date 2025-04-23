package service;

import domain.Matriz;

public class MatrizServiceImpl implements MatrizService {

    @Override
    public void imprimir(Matriz matriz) {
        int[][] datos = matriz.getDatos();
        for (int[] fila : datos) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    @Override
    public Matriz transponer(Matriz matriz) {
        int filas = matriz.getFilas();
        int columnas = matriz.getColumnas();
        int[][] original = matriz.getDatos();
        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = original[i][j];
            }
        }

        return new Matriz(transpuesta);
    }
}

