package de.maxwell.gameslib;

import org.bukkit.Location;

public class Lobby {

    private Arena arena;
    private Area area;
    private Location spawn;

    public Lobby(Arena arena, Area area, Location spawn) {
        this.arena = arena;
        this.area = area;
        this.spawn = spawn;
    }

    public Arena getArena() {
        return this.arena;
    }

    public Area getArea() {
        return this.area;
    }

    public Location getSpawn() {
        return this.spawn;
    }
}