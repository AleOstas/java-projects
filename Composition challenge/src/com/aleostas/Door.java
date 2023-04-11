package com.aleostas;

public class Door {
    private String material;
    private double height;

    public Door(String material, double height) {
        this.material = material;
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public double getHeight() {
        return height;
    }
}
