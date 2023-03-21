package de.maxwell.games;

public class PluginException extends RuntimeException {

    public PluginException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public PluginException(String message) {
        super(message);
    }

    public PluginException(Throwable throwable) {
        super(throwable);
    }
}