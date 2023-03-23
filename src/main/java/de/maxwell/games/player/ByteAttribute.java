package de.maxwell.games.player;

import java.util.Objects;

public class ByteAttribute implements Attribute<Byte> {

    private final AttributeType type;
    private final Byte value;

    public ByteAttribute(Byte value) {
        this.type = AttributeType.BYTE;
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Byte getValue() {
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