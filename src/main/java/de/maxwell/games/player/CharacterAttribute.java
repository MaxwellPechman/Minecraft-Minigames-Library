package de.maxwell.games.player;

import java.util.Objects;

public class CharacterAttribute implements Attribute<Character> {

    private final AttributeType type;
    private final Character value;

    public CharacterAttribute(Character value) {
        this.type = AttributeType.CHAR;
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Character getValue() {
        return this.value;
    }

    @Override
    public AttributeType getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}