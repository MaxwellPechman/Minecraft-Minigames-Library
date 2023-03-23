package de.maxwell.games.chat.code;

import de.maxwell.games.chat.SegmentType;
import org.jetbrains.annotations.NotNull;

import java.util.stream.IntStream;

public class CodeSegment implements SubSegment {

    public static final char DEFAULT_PREFIX = '\u00A7';

    private final char codePrefix;
    private final ChatCode code;
    private final String segment;

    public CodeSegment(final ChatCode code) {
        this(DEFAULT_PREFIX, code);
    }

    public CodeSegment(final char codePrefix, final ChatCode code) {
        this.codePrefix = codePrefix;
        this.code = code;
        this.segment = codePrefix + code.toString();
    }

    public char getCodePrefix() {
        return this.codePrefix;
    }

    public ChatCode getChatCode() {
        return this.code;
    }

    public char getCode() {
        return this.code.getCode();
    }

    public boolean isColor() {
        return this.code.isColor();
    }

    @Override
    public boolean hasColor() {
        return false;
    }

    @Override
    public ColorCode getColor() {
        return null;
    }

    @Override
    public ColorCode[] getColors() {
        return new ColorCode[0];
    }

    @Override
    public void setColor(int index, ColorCode color) {

    }

    @Override
    public void removeColor(ColorCode color) {

    }

    @Override
    public void removeColorAt() {

    }

    @Override
    public void removeColors() {

    }

    @Override
    public boolean hasFormat() {
        return false;
    }

    @Override
    public FormatCode getFormat() {
        return null;
    }

    @Override
    public FormatCode[] getFormats() {
        return new FormatCode[0];
    }

    @Override
    public void setFormat(int index, FormatCode format) {

    }

    @Override
    public SegmentType getType() {
        return SegmentType.CODE;
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