package de.maxwell.games.player;

public interface Attribute<V> extends Iterable<V> {

    String getName();

    AttributeType getType();

    boolean hasValue(V value);

    boolean isEmpty();

    void setValue(int index, V value);

    V getValue(int index);

    void addValue(V value);

    V removeValue(int index);

    V[] toArray();
}