package de.maxwell.games.chat;

import org.jetbrains.annotations.NotNull;

public class Message implements ChatSegment {

    private final String message;

    public Message(final String message) {
        this.message = message;
    }

    @Override
    public String getString() {
        return null;
    }

    @Override
    public boolean hasBukkitColor() {
        return false;
    }

    @Override
    public boolean hasBukkitFormat() {
        return false;
    }

    @Override
    public int length() {
        return this.message.length();
    }

    @Override
    public char charAt(int index) {
        return this.message.charAt(index);
    }

    @NotNull
    @Override
    public CharSequence subSequence(int start, int end) {
        return this.message.subSequence(start, end);
    }
}