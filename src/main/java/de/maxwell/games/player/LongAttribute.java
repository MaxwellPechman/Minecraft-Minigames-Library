package de.maxwell.games.player;

import java.util.Objects;

public class LongAttribute implements Attribute<Long> {

    private final AttributeType type;
    private final Long value;

    public LongAttribute(Long value) {
        this.type = AttributeType.LONG;
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Long getValue() {
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