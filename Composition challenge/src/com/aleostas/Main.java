package com.aleostas;

public class Main {

    public static void main(String[] args) {

        Wall northWall = new Wall("White");
        Wall southWall = new Wall("Dark");
        Wall eastWall = new Wall("Wood");
        Wall westWall = new Wall("White");

        Door door = new Door("Wooden", 2.1);

        Bed bed = new Bed("Modern", "memory foam", 4, "wood");

        Ceiling ceiling = new Ceiling(5, "black");

        Floor floor = new Floor("wood", "carpet", 150);

        Bedroom bedRoom = new Bedroom("Ale's", Wall, Door, Ceiling, Floor);
    }
}
