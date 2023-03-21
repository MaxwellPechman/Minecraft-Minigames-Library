package de.maxwell.games.player;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;

public class IntegerAttribute implements Attribute<Integer> {

    private final String name;
    private final AttributeType type;
    private final ArrayList<Integer> values;

    public IntegerAttribute(final String name) {
        if(name.equalsIgnoreCase("") || name == null) throw new RuntimeException("");

        this.name = name;
        this.type = AttributeType.INTEGER;
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
    public boolean hasValue(Integer value) {
        return this.values.contains(value);
    }

    @Override
    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    @Override
    public void setValue(int index, Integer value) {
        this.values.set(index, value);
    }

    @Override
    public Integer getValue(int index) {
        return this.values.get(index);
    }

    @Override
    public void addValue(Integer value) {
        this.values.add(value);
    }

    @Override
    public Integer removeValue(int index) {
        return this.values.remove(index);
    }

    @Override
    public Integer[] toArray() {
        int size = this.values.size();
        Integer[] array = new Integer[size];
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