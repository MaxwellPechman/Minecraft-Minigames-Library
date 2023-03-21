package de.maxwell.games.player;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;

public class BooleanAttribute implements Attribute<Boolean> {

    private final String name;
    private final AttributeType type;
    private final ArrayList<Boolean> values;

    public BooleanAttribute(final String name) {
        if(name.equalsIgnoreCase("") || name == null) throw new RuntimeException("");

        this.name = name;
        this.type = AttributeType.BOOLEAN;
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
    public boolean hasValue(Boolean value) {
        return this.values.contains(value);
    }

    @Override
    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    @Override
    public void setValue(int index, Boolean value) {
        this.values.set(index, value);
    }

    @Override
    public Boolean getValue(int index) {
        return this.values.get(index);
    }

    @Override
    public void addValue(Boolean value) {
        this.values.add(value);
    }

    @Override
    public Boolean removeValue(int index) {
        return this.values.remove(index);
    }

    @Override
    public Boolean[] toArray() {
        int size = this.values.size();
        Boolean[] array = new Boolean[size];
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