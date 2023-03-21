package de.maxwell.games.area;

import de.maxwell.games.PluginException;

public class AreaException extends PluginException {

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