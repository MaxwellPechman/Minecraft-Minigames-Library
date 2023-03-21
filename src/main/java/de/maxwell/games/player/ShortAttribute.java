package de.maxwell.games.player;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;

public class ShortAttribute implements Attribute<Short> {

    private final String name;
    private final AttributeType type;
    private final ArrayList<Short> values;

    public ShortAttribute(final String name) {
        if(name.equalsIgnoreCase("") || name == null) throw new RuntimeException("");

        this.name = name;
        this.type = AttributeType.SHORT;
        this.values = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public AttributeType getType() {
        return this.type;
    }

    @Override
    public boolean hasValue(Short value) {
        return this.values.contains(value);
    }

    @Override
    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    @Override
    public void setValue(int index, Short value) {
        this.values.set(index, value);
    }

    @Override
    public Short getValue(int index) {
        return this.values.get(index);
    }

    @Override
    public void addValue(Short value) {
        this.values.add(value);
    }

    @Override
    public Short removeValue(int index) {
        return this.values.remove(index);
    }

    @Override
    public Short[] toArray() {
        int size = this.values.size();
        Short[] array = new Short[size];
        for(int index = 0; index < size; index++) {
            array[index] = this.values.get(index);
        }

        return array;
    }

    @NotNull
    @Override
    public Iterator iterator() {
        return this.values.iterator();
    }

    @Override
    public String toString() {
        return this.name + ", " + this.values.toString();
    }
}