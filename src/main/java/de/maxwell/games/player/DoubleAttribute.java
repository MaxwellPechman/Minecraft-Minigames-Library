package de.maxwell.games.player;

import java.util.Objects;

public class DoubleAttribute implements Attribute<Double> {

    private final AttributeType type;
    private final Double value;

    public DoubleAttribute(Double value) {
        this.type = AttributeType.DOUBLE;
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Double getValue() {
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