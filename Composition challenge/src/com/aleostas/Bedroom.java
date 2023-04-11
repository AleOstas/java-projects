package com.aleostas;

public class Bedroom {
    private String name;
    private Wall northWall;
    private Wall southWall;
    private Wall eastWall;
    private Wall westWall;
    private Door door;
    private Bed bed;

    public Bedroom(String name, Wall northWall, Wall southWall, Wall eastWall, Wall westWall, Door door, Bed bed) {
        this.name = name;
        this.northWall = northWall;
        this.southWall = southWall;
        this.eastWall = eastWall;
        this.westWall = westWall;
        this.door = door;
        this.bed = bed;
    }

    public String getName() {
        return name;
    }

    public Wall getNorthWall() {
        return northWall;
    }

    public Wall getSouthWall() {
        return southWall;
    }

    public Wall getEastWall() {
        return eastWall;
    }

    public Wall getWestWall() {
        return westWall;
    }

    public Door getDoor() {
        return door;
    }
    public Bed getBed() {
        return bed;
    }
}
