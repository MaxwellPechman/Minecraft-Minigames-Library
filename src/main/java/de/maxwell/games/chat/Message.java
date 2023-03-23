package de.maxwell.games.chat;

import de.maxwell.games.chat.code.SubSegment;
import org.jetbrains.annotations.NotNull;

import java.util.stream.IntStream;

public class Message implements ChatSegment {

    private final String segment;

    public Message() {
        this(null);
    }

    public Message(String string) {
        this.segment = String.valueOf(string);
    }

    @Override
    public boolean hasSubSegment() {
        return false;
    }

    @Override
    public SubSegment getSubSegment() {
        return null;
    }

    @Override
    public SegmentType getType() {
        return SegmentType.SUB;
    }

    @Override
    public String getSegment() {
        return this.segment;
    }

    @Override
    public int length() {
        return this.segment.length();
    }

    @Override
    public char charAt(int index) {
        if(index < 0 || index > this.length()) throw new IndexOutOfBoundsException("");

        return this.segment.charAt(index);
    }

    @Override
    public boolean isEmpty() {
        return this.segment.isEmpty();
    }

    @NotNull
    @Override
    public CharSequence subSequence(int start, int end) {
        if(end < 0 || end > this.length()) {
            throw new IndexOutOfBoundsException("");
        }

        if(start < 0 || start > end) {
            throw new IndexOutOfBoundsException("");
        }

        return this.segment.subSequence(start, end);
    }

    @NotNull
    @Override
    public IntStream chars() {
        return this.segment.chars();
    }

    @NotNull
    @Override
    public IntStream codePoints() {
        return this.segment.codePoints();
    }

    @Override
    public String toString() {
        return this.segment;
    }
}