package de.maxwell.games.area;

public enum AreaType {

    SQUARE("Square"),
    SPHERICAL("Spherical"),
    POLYHEDRAL("Polyhedral"),
    CUSTOM("Custom");

    String name;

    AreaType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}