package de.maxwell.gameslib;

import org.bukkit.Location;
import org.bukkit.World;

import java.util.ArrayList;
import java.util.Iterator;

public class SquareArea implements Area, Iterable<Location> {

    private final World world;
    private final int fromX, fromY, fromZ;
    private final int toX, toY, toZ;
    private final ArrayList<Location> locations;

    public SquareArea(Location from, Location to) {
        if(!from.getWorld().equals(to.getWorld())) throw new AreaException("Locations must be in the same World.");

        this.world = from.getWorld();
        this.fromX = Math.min(from.getBlockX(), to.getBlockX());
        this.fromY = Math.min(from.getBlockY(), to.getBlockY());
        this.fromZ = Math.min(from.getBlockZ(), to.getBlockZ());
        this.toX = Math.max(from.getBlockX(), to.getBlockX());
        this.toY = Math.max(from.getBlockY(), to.getBlockY());
        this.toZ = Math.max(from.getBlockZ(), to.getBlockZ());
        this.locations = new ArrayList<>();

        this.setupArea();
    }

    public SquareArea(World world, int fromX, int fromY, int fromZ, int toX, int toY, int toZ) {
        this.world = world;
        this.fromX = fromX;
        this.fromY = fromY;
        this.fromZ = fromZ;
        this.toX = toX;
        this.toY = toY;
        this.toZ = toZ;
        this.locations = new ArrayList<>();

        this.setupArea();
    }

    private void setupArea() {
        for(int x = this.fromX; x < this.toX; x++) {
            for(int y = this.fromY; y < this.toY; y++) {
                for(int z = this.fromZ; z < this.toZ; z++) {
                    this.locations.add(new Location(this.world, x, y, z).toBlockLocation());
                }
            }
        }
    }

    @Override
    public World getWorld() {
        return this.world;
    }

    @Override
    public int getFromX() {
        return this.fromX;
    }

    @Override
    public int getFromY() {
        return this.fromY;
    }

    @Override
    public int getFromZ() {
        return this.fromZ;
    }

    @Override
    public int getToX() {
        return this.toX;
    }

    @Override
    public int getToY() {
        return this.toY;
    }

    @Override
    public int getToZ() {
        return this.toZ;
    }

    @Override
    public int getLength() {
        return this.toX - this.fromX;
    }

    @Override
    public int getWidth() {
        return this.toZ - this.fromZ;
    }

    @Override
    public int getHeight() {
        return this.toY - this.fromY;
    }

    @Override
    public int getVolume() {
        return this.locations.size() - 1;
    }

    @Override
    public boolean isSquareArea() {
        return true;
    }

    @Override
    public boolean isSphericalArea() {
        return false;
    }

    @Override
    public boolean isPolyhedralArea() {
        return false;
    }

    @Override
    public SquareArea getAsSquareArea() {
        return this;
    }

    @Override
    public SphericalArea getAsSphericalArea() {
        return new SphericalArea();
    }

    @Override
    public PolyhedralArea getAsPolyhedralArea() {
        return new PolyhedralArea();
    }

    @Override
    public Location[] getLayer(int yLayer) {
        if(yLayer < this.fromY || yLayer > this.toY) {
            throw new IndexOutOfBoundsException("Area does not contain a layer a height: " + yLayer + ".");
        }

        int size = this.getLength() * this.getWidth();
        int index = 0;

        Location[] layer = new Location[size];
        for(Location location : this.locations) {
            if(location.getBlockY() == yLayer) {
                layer[index] = location;
            }

            index++;
        }

        return layer;
    }

    @Override
    public Location[] toArray() {
        Location[] locationArray = new Location[this.getVolume()];
        for(int index = 0; index < this.getVolume(); index ++ ) {
            locationArray[index] = this.locations.get(index);
        }

        return locationArray;
    }

    @Override
    public Iterator<Location> iterator() {
        return this.locations.iterator();
    }

    @Override
    public String toString() {
        return this.fromX + ", " + this.fromY + ", " + this.fromZ + ", " + this.toX + ", " + this.toY + ", " + this.toZ + ", " + this.locations.toString();
    }
}