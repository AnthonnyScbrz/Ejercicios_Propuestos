package Interfaces;

import core.Matriz;
import exceptions.MatrizOperationException;

public interface MatrizOperations {
    Matriz operate(Matriz a, Matriz b) throws MatrizOperationException;
}
