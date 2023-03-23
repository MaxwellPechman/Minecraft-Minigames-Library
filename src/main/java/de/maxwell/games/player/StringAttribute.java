package de.maxwell.games.player;

import java.util.Objects;

public class StringAttribute implements Attribute<String> {

    private final AttributeType type;
    private final String value;

    public StringAttribute(String value) {
        this.type = AttributeType.STRING;
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String getValue() {
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