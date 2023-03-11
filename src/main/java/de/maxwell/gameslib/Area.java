package de.maxwell.gameslib;

import org.bukkit.Location;
import org.bukkit.World;

public interface Area {

    World getWorld();

    int getFromX();

    int getFromY();

    int getFromZ();

    int getToX();

    int getToY();

    int getToZ();

    int getLength();

    int getWidth();

    int getHeight();

    int getVolume();

    boolean isSquareArea();

    boolean isSphericalArea();

    boolean isPolyhedralArea();

    SquareArea getAsSquareArea();

    SphericalArea getAsSphericalArea();

    PolyhedralArea getAsPolyhedralArea();

    Location[] getLayer(int yLayer);

    Location[] toArray();
}