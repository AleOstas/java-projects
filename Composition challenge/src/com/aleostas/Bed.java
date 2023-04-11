package com.aleostas;

public class Bed {
    private String type;
    private String mattress;
    private int pillows;
    private String material;



    public Bed(String type, String mattress, int pillows, String material) {
        this.type = type;
        this.mattress = mattress;
        this.pillows = pillows;
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public String getMattress() {
        return mattress;
    }

    public int getPillows() {
        return pillows;
    }

    public String getMaterial() {
        return material;
    }
}
