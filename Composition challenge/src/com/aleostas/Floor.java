package com.aleostas;

public class Floor {
    private String material;
    private String covering;
    private int dimension;

    public Floor(String material, String covering, int dimension) {
        this.material = material;
        this.covering = covering;
        this.dimension = dimension;
    }

    public String getMaterial() {
        return material;
    }

    public String getCovering() {
        return covering;
    }

    public int getDimension() {
        return dimension;
    }
}
