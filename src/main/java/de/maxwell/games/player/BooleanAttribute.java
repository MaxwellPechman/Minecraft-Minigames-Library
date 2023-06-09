package de.maxwell.games.player;

import java.util.Objects;

public class BooleanAttribute implements Attribute<Boolean> {

    private final AttributeType type;
    private final Boolean value;

    public BooleanAttribute(Boolean value) {
        this.type = AttributeType.BOOLEAN;
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Boolean getValue() {
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