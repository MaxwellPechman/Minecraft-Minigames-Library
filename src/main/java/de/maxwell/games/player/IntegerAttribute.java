package de.maxwell.games.player;

import java.util.Objects;

public class IntegerAttribute implements Attribute<Integer> {

    private final AttributeType type;
    private final Integer value;

    public IntegerAttribute(Integer value) {
        this.type = AttributeType.INTEGER;
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Integer getValue() {
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