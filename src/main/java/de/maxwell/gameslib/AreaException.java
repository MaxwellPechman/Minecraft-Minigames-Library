package de.maxwell.gameslib;

public class AreaException extends MinecraftMinigamesException {

    public AreaException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public AreaException(String message) {
        super(message);
    }

    public AreaException(Throwable throwable) {
        super(throwable);
    }
}