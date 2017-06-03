package creational.abstract_factory;

import creational.abstract_factory.base.Door;
import creational.abstract_factory.base.Maze;
import creational.abstract_factory.base.MazeFactory;
import creational.abstract_factory.base.Room;

import static creational.abstract_factory.base.Side.*;

public class MazeGame {
    public static Maze createMaze(MazeFactory factory) {
        Maze maze = factory.makeMaze();
        Room r1 = factory.makeRoom(1);
        Room r2 = factory.makeRoom(2);
        Door door = factory.makeDoor(r1, r2);

        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide(NORTH, factory.makeWall());
        r1.setSide(EAST, door);
        r1.setSide(SOUTH, factory.makeWall());
        r1.setSide(WEST, factory.makeWall());

        r2.setSide(NORTH, factory.makeWall());
        r2.setSide(EAST, factory.makeWall());
        r2.setSide(SOUTH, factory.makeWall());
        r2.setSide(WEST, door);

        return maze;
    }
}
