package creational.abstract_factory;

import creational.abstract_factory.base.Maze;
import creational.abstract_factory.base.MazeFactory;
import creational.abstract_factory.base.Side;
import creational.abstract_factory.bombed.BombedMazeFactory;
import creational.abstract_factory.bombed.BombedWall;
import creational.abstract_factory.bombed.RoomWithABomb;
import creational.abstract_factory.enchanted.DoorNeedingSpell;
import creational.abstract_factory.enchanted.EnchantedMazeFactory;
import creational.abstract_factory.enchanted.EnchantedRoom;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MazeGameTest {
    @Test
    public void createNormalMaze() {
        Maze maze = MazeGame.createMaze(new MazeFactory());
        assertTrue(maze.getRoom(1) != null);
    }

    @Test
    public void createEnchantedMaze() {
        Maze maze = MazeGame.createMaze(new EnchantedMazeFactory());
        assertTrue(maze.getRoom(1) instanceof EnchantedRoom);
        assertTrue(maze.getRoom(1).getSide(Side.EAST) instanceof DoorNeedingSpell);
    }

    @Test
    public void createBombedMaze() {
        Maze maze = MazeGame.createMaze(new BombedMazeFactory());
        assertTrue(maze.getRoom(1) != null);
        assertTrue(maze.getRoom(1) instanceof RoomWithABomb);
        assertTrue(maze.getRoom(1).getSide(Side.NORTH) instanceof BombedWall);
    }
}