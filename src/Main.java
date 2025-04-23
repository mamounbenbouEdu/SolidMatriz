import domain.Matriz;
import service.MatrizService;
import service.MatrizServiceImpl;

public class Main {
    public static void main(String[] args) {
        int[][] datos = {
                {1, 2, 3},
                {4, 5, 6}
        };

        Matriz matrizOriginal = new Matriz(datos);
        MatrizService servicio = new MatrizServiceImpl();

        System.out.println("Matriz original:");
        servicio.imprimir(matrizOriginal);

        System.out.println("\nMatriz transpuesta:");
        Matriz transpuesta = servicio.transponer(matrizOriginal);
        servicio.imprimir(transpuesta);
    }
}