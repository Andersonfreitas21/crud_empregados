package com.java.tech.gerenciador_empregados.exception;

public class EmpregadoNotFoundExeception extends RuntimeException {
    public EmpregadoNotFoundExeception(String message){
        super(message);
    }
}
