package de.maxwell.games.area;

import org.bukkit.Location;
import org.bukkit.World;

import java.util.Arrays;
import java.util.Iterator;

public class SquareArea extends Area {

    private AreaType type;
    private AreaBlock[] blocks;

    public SquareArea(Location fromLocation, Location tillLocation) {
        super(fromLocation, tillLocation);

        this.setupArea();
    }

    public SquareArea(World world, int fromX, int fromY, int fromZ, int tillX, int tillY, int tillZ) {
        super(world, fromX, fromY, fromZ, tillX, tillY, tillZ);

        this.setupArea();
    }

    private void setupArea() {
        this.type = AreaType.SQUARE;
        this.blocks = new AreaBlock[this.getVolume()];

        int index = 0;
        for(int x = this.getFromX(); x < this.getTillX(); x++) {
            for(int y = this.getFromY(); y < this.getTillY(); y++) {
                for(int z = this.getFromZ(); z < this.getTillZ(); z++) {
                    this.blocks[index] = new AreaBlock(this, x, y, z);
                    index++;
                }
            }
        }
    }

    @Override
    public boolean inArea(Location location) {
        if(location == null) {
            throw new AreaException("Location is null.");
        }

        for(AreaBlock blocks : this.blocks) {
            if(blocks.getLocation().equals(location)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public AreaType getType() {
        return this.type;
    }

    @Override
    public int blockAmount() {
        return this.blocks.length;
    }

    @Override
    public AreaBlock[] getLayer(int layerIndex) {
        if(layerIndex < 0 || layerIndex > this.getTillY()) {
            throw new AreaException("Index: " + layerIndex + ", Height: " + this.getTillY());
        }

        int index = 0;
        AreaBlock[] layerBlocks = new AreaBlock[this.getWidth() * this.getLength()];
        for(int subdex = 0; subdex < this.blockAmount(); subdex++) {
            AreaBlock block = this.blocks[subdex];

            if(block.getAreaY() == layerIndex) {
                layerBlocks[index] = this.blocks[subdex];
                index++;
            }
        }

        return layerBlocks;
    }

    @Override
    public AreaBlock[] toArray() {
        return this.blocks;
    }

    @Override
    public Iterator<AreaBlock> iterator() {
        return Arrays.stream(this.blocks).iterator();
    }

    @Override
    public String toString() {
        return this.type.toString() + ", " + this.blocks.toString();
    }
}