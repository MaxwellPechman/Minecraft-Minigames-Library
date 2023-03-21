package de.maxwell.games.area;

import org.bukkit.Location;
import org.bukkit.World;

import java.util.Iterator;

public abstract class Area implements Iterable<AreaBlock> {

    private final World world;
    private final int fromX, fromY, fromZ;
    private final int tillX, tillY, tillZ;

    public Area(Location fromLocation, Location tillLocation) {
        if(!fromLocation.getWorld().equals(tillLocation.getWorld()))
            throw new AreaException("Worlds of entered locations are not equal.");

        this.world = fromLocation.getWorld();
        this.fromX = Math.min(fromLocation.getBlockX(), tillLocation.getBlockX());
        this.fromY = Math.min(fromLocation.getBlockY(), tillLocation.getBlockY());
        this.fromZ = Math.min(fromLocation.getBlockZ(), tillLocation.getBlockZ());
        this.tillX = Math.max(fromLocation.getBlockX(), tillLocation.getBlockX());
        this.tillY = Math.max(fromLocation.getBlockY(), tillLocation.getBlockY());
        this.tillZ = Math.max(fromLocation.getBlockZ(), tillLocation.getBlockZ());
    }

    public Area(World world, int fromX, int fromY, int fromZ, int tillX, int tillY, int tillZ) {
        this.world = world;
        this.fromX = fromX;
        this.fromY = fromY;
        this.fromZ = fromZ;
        this.tillX = tillX;
        this.tillY = tillY;
        this.tillZ = tillZ;
    }

    public int getWidth() {
        return this.tillX - this.fromX;
    }

    public int getHeight() {
        return this.tillY - this.fromY;
    }

    public int getLength() {
        return this.tillZ - this.fromZ;
    }

    public int getVolume() {
        return this.getWidth() * this.getHeight() * this.getLength();
    }

    public World getWorld() {
        return this.world;
    }

    public int getFromX() {
        return this.fromX;
    }

    public int getFromY() {
        return this.fromY;
    }

    public int getFromZ() {
        return this.fromZ;
    }

    public int getTillX() {
        return this.tillX;
    }

    public int getTillY() {
        return this.tillY;
    }

    public int getTillZ() {
        return this.tillZ;
    }

    public boolean inArea(Location location) {
        throw new UnsupportedOperationException("");
    }

    public AreaType getType() {
        throw new UnsupportedOperationException("");
    }

    public int blockAmount() {
        throw new UnsupportedOperationException("");
    }

    public AreaBlock[] getLayer(int layerIndex) {
        throw new UnsupportedOperationException("");
    }

    public AreaBlock[] toArray() {
        throw new UnsupportedOperationException("");
    }

    @Override
    public Iterator<AreaBlock> iterator() {
        throw new UnsupportedOperationException("");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("");
    }
}