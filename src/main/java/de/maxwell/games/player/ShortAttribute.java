package de.maxwell.games.player;

import java.util.Objects;

public class ShortAttribute implements Attribute<Short> {

    private final AttributeType type;
    private final Short value;

    public ShortAttribute(Short value) {
        this.type = AttributeType.SHORT;
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Short getValue() {
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