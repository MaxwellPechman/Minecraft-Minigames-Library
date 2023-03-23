package de.maxwell.games.player;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class PlayerData implements Map<String, AttributeList> {

    private final UUID playerID;
    private final Player player;
    private final HashMap<String, AttributeList> attributeData;

    public PlayerData(Player player) {
        this(Objects.requireNonNull(player.getUniqueId()));
    }

    public PlayerData(UUID playerID) {
        this.playerID = Objects.requireNonNull(playerID);
        this.player = Bukkit.getPlayer(playerID);
        this.attributeData = new HashMap<>();
    }

    public Map<String, AttributeList> getAttributeData() {
        return this.attributeData;
    }

    public Player getPlayer() {
        return this.player;
    }

    public UUID getPlayerID() {
        return this.playerID;
    }

    public String getPlayerName() {
        return this.player.getName();
    }

    @Override
    public int size() {
        return this.attributeData.size();
    }

    @Override
    public boolean isEmpty() {
        return this.attributeData.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return this.attributeData.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return this.attributeData.containsValue(value);
    }

    @Override
    public AttributeList get(Object key) {
        return this.attributeData.get(key);
    }

    @Nullable
    @Override
    public AttributeList put(String key, AttributeList value) {
        return this.attributeData.put(key, value);
    }

    @Override
    public AttributeList remove(Object key) {
        return this.attributeData.remove(key);
    }

    @Override
    public void putAll(@NotNull Map<? extends String, ? extends AttributeList> map) {
        this.attributeData.putAll(map);
    }

    @Override
    public void clear() {
        this.attributeData.clear();
    }

    @NotNull
    @Override
    public Set<String> keySet() {
        return this.attributeData.keySet();
    }

    @NotNull
    @Override
    public Collection<AttributeList> values() {
        return this.attributeData.values();
    }

    @NotNull
    @Override
    public Set<Entry<String, AttributeList>> entrySet() {
        return this.attributeData.entrySet();
    }

    @Override
    public String toString() {
        return this.playerID.toString() + ", " + this.getPlayerName() + ", " + this.attributeData.toString();
    }
}