package de.maxwell.games.chat;

import org.jetbrains.annotations.NotNull;

public class Prefix implements ChatSegment {

    private final String prefix;

    public Prefix(final String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String getString() {
        return null;
    }

    @Override
    public int length() {
        return this.prefix.length();
    }

    @Override
    public char charAt(int index) {
        return this.prefix.charAt(index);
    }

    @NotNull
    @Override
    public CharSequence subSequence(int start, int end) {
        return this.prefix.subSequence(start, end);
    }
}