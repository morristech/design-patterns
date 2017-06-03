package creational.prototype

import base.maze.Side
import creational.prototype.bombed.RoomWithBombProto
import creational.prototype.bombed.BombedWallProto
import creational.prototype.maze.DoorProto
import creational.prototype.maze.RoomProto
import creational.prototype.maze.WallProto
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class MazePrototypeFactoryTest {

    @Test
    fun basePrototypes() {
        val maze = MazeGame.createMaze(MazePrototypeFactory(
                        prototypeDoor = DoorProto(),
                        prototypeRoom = RoomProto(),
                        prototypeWall = WallProto()))
        assertTrue(maze.getRoom(1) != null)
    }

    @Test
    fun createBombedMaze() {
        val maze = MazeGame.createMaze(MazePrototypeFactory(
                prototypeDoor = DoorProto(),
                prototypeRoom = RoomWithBombProto(),
                prototypeWall = BombedWallProto()))
        assertTrue(maze.getRoom(1) != null)
        assertTrue(maze.getRoom(1) is RoomWithBombProto)
        assertTrue(maze.getRoom(1)?.getSide(Side.NORTH) is BombedWallProto)
    }
}

