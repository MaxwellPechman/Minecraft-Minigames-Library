package de.maxwell.games.chat.code;

public enum FormatCode implements ChatCode {

    OBFUSCATED('k'),
    BOLD('l'),
    STRIKETHROUGH('m'),
    UNDERLINE('n'),
    ITALIC('O'),
    RESET('r');

    private final char code;

    FormatCode(final char code) {
        this.code = code;
    }

    @Override
    public char getCode() {
        return this.code;
    }

    @Override
    public boolean isColor() {
        return false;
    }

    @Override
    public String toString() {
        return String.valueOf(this.code);
    }
}