package de.maxwell.gameslib;

import org.bukkit.Location;

import java.util.ArrayList;

public class Arena {

    private final Area area;
    private final Lobby lobby;
    private ArrayList<Location> spawns;

    public Arena(Area area, Lobby lobby) {
        this.area = area;
        this.lobby = lobby;

        this.spawns = new ArrayList<>();
    }

    public Area getArea() {
        return this.area;
    }

    public Lobby getLobby() {
        return this.lobby;
    }

    public void addSpawn(Location spawn) {

    }
}