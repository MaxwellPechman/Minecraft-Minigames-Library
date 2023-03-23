package de.maxwell.games.player;

import java.util.ArrayList;
import java.util.Collection;

public class AttributeList extends ArrayList<Attribute> {

    public static final int DEFAULT_CAPACITY = 10;

    public AttributeList() {
        this(DEFAULT_CAPACITY);
    }

    public AttributeList(int initialCapacity) {
        super(initialCapacity);
    }

    public AttributeList(Collection<Attribute> collection) {
        super(collection);
    }

    public Attribute[] asArray() {
        final int size = this.size();
        Attribute[] attributes = new Attribute[size];
        for(int index = 0; index < size; index++) {
            attributes[index] = this.get(index);
        }

        return attributes;
    }
}