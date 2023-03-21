package de.maxwell.games.chat;

public interface ChatSegment extends CharSequence {

    String getString();

    boolean hasBukkitColor();

    boolean hasBukkitFormat();
}