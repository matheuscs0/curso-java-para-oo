package br.com.alura.screenmatch.exceptions;

public class ErroDeAnoInvalidoException extends RuntimeException {
    private String message;

    public ErroDeAnoInvalidoException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
