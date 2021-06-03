package org.masivian.test.exceptions;
public class BetException extends Exception {
    public static final String INVALID_AMOUNT  ="El monto a apostar debe ser mayor que 0 y menor que 10000 dolares";
    public static final String NULL_COLOR = "El color de la apusta no puede ser un valor nulo";
    public static final String INVALID_NUMBER = "El numero de la apuesta debe estar en una rango mayor a 0 y menor a 30";
    public BetException() {
        super();
    }
    public BetException(String message) {
        super(message);
    }
}
