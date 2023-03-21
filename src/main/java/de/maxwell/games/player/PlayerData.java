package de.maxwell.games.player;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

public class PlayerData implements Iterable<Attribute> {

    private final UUID playerID;
    private final ArrayList<Attribute> attributes;

    public PlayerData(UUID playerID) {
        this.playerID = playerID;
        this.attributes = new ArrayList<>();
    }

    public Player getPlayer() {
        return Bukkit.getPlayer(this.playerID);
    }

    public String getPlayerName() {
        return this.getPlayer().getName();
    }

    public UUID getPlayerID() {
        return this.playerID;
    }

    public boolean hasValue(Attribute attribute) {
        return this.attributes.contains(attribute);
    }

    public boolean isEmpty() {
        return this.attributes.isEmpty();
    }

    public Attribute getAttribute(int index) {
        return this.attributes.get(index);
    }

    public void setAttributes(int index, Attribute attribute) {
        this.attributes.set(index, attribute);
    }

    public void addAttribute(Attribute attribute) {
        this.attributes.add(attribute);
    }

    public Attribute removeAttribute(int index) {
        return this.attributes.remove(index);
    }

    @NotNull
    @Override
    public Iterator<Attribute> iterator() {
        return this.attributes.iterator();
    }

    @Override
    public String toString() {
        return this.playerID.toString() + ", " + this.attributes;
    }
}