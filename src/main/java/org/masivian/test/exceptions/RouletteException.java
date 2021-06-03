package org.masivian.test.exceptions;
public class RouletteException extends Exception{
    public static final String NOT_FOUND_ROULETTE = "No se encontro la ruleta identificada con ese ID";
    public RouletteException() {
        super();
    }
    public RouletteException(String message) {
        super(message);
    }
}
