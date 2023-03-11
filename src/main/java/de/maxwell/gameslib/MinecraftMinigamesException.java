package de.maxwell.gameslib;

public class MinecraftMinigamesException extends RuntimeException {

    public MinecraftMinigamesException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public MinecraftMinigamesException(String message) {
        super(message);
    }

    public MinecraftMinigamesException(Throwable throwable) {
        super(throwable);
    }
}