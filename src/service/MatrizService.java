package service;

import domain.Matriz;

public interface MatrizService {
    void imprimir(Matriz matriz);
    Matriz transponer(Matriz matriz);
}
