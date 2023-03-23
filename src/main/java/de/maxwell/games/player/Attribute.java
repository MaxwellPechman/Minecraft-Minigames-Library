package de.maxwell.games.player;

public interface Attribute<V> {

    V getValue();

    AttributeType getType();
}