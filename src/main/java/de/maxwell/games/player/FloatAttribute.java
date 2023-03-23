package de.maxwell.games.player;

import java.util.Objects;

public class FloatAttribute implements Attribute<Float> {

    private final AttributeType type;
    private final Float value;

    public FloatAttribute(Float value) {
        this.type = AttributeType.FLOAT;
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Float getValue() {
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