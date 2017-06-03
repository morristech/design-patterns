package abstract_factory;

import abstract_factory.base.Maze;
import abstract_factory.base.MazeFactory;
import abstract_factory.base.Room;
import abstract_factory.base.Side;
import abstract_factory.bombed.BombedMazeFactory;
import abstract_factory.bombed.BombedWall;
import abstract_factory.bombed.RoomWithABomb;
import abstract_factory.enchanted.DoorNeedingSpell;
import abstract_factory.enchanted.EnchantedMazeFactory;
import abstract_factory.enchanted.EnchantedRoom;
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