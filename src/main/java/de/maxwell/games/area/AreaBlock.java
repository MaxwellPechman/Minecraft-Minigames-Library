package de.maxwell.games.area;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;

public class AreaBlock {

    private final Area area;
    private final Location location;
    private final int areaX, areaY, areaZ;

    public AreaBlock(Area area, Location location) {
        if(!area.getWorld().equals(location.getWorld()))
            throw new AreaException("World of area and world of location are not equal.");

        this.area = area;
        this.location = location;
        this.areaX = location.getBlockX() - Math.abs(area.getFromX());
        this.areaY = location.getBlockY() - Math.abs(area.getFromY());
        this.areaZ = location.getBlockZ() - Math.abs(area.getFromZ());
    }

    public AreaBlock(Area area, int areaX, int areaY, int areaZ) {
        this.area = area;
        this.areaX = areaX;
        this.areaY = areaY;
        this.areaZ = areaZ;
        this.location = new Location(this.area.getWorld(),
                area.getFromX() + areaX,
                area.getFromY() + areaY,
                area.getFromZ() + areaZ);
    }

    public World getWorld() {
        return this.area.getWorld();
    }

    public Block getBlock() {
        return this.location.getBlock();
    }

    public Material getType() {
        return this.getBlock().getType();
    }

    public int getX() {
        return this.location.getBlockX();
    }

    public int getY() {
        return this.location.getBlockY();
    }

    public int getZ() {
        return this.location.getBlockZ();
    }

    public Area getArea() {
        return this.area;
    }

    public Location getLocation() {
        return this.location;
    }

    public int getAreaX() {
        return this.areaX;
    }

    public int getAreaY() {
        return this.areaY;
    }

    public int getAreaZ() {
        return this.areaZ;
    }

    @Override
    public String toString() {
        return this.getType().toString() + ", " +
                this.getAreaX() + ", " +
                this.getAreaY() + ", " +
                this.getAreaZ();
    }
}