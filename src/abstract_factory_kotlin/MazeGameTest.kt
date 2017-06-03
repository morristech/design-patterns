package abstract_factory_kotlin

import abstract_factory_kotlin.base.MazeFactory
import base.maze.Side
import abstract_factory_kotlin.bombed.BombedMazeFactory
import abstract_factory_kotlin.bombed.BombedWall
import abstract_factory_kotlin.bombed.RoomWithABomb
import abstract_factory_kotlin.enchanted.DoorNeedingSpell
import abstract_factory_kotlin.enchanted.EnchantedMazeFactory
import abstract_factory_kotlin.enchanted.EnchantedRoom
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class MazeGameTest {
    @Test
    fun createNormalMaze() {
        val maze = MazeGame.createMaze(MazeFactory())
        assertTrue(maze.getRoom(1) != null)
    }

    @Test
    fun createEnchantedMaze() {
        val maze = MazeGame.createMaze(EnchantedMazeFactory())
        assertTrue(maze.getRoom(1) is EnchantedRoom)
        assertTrue(maze.getRoom(1)?.getSide(Side.EAST) is DoorNeedingSpell)
    }

    @Test
    fun createBombedMaze() {
        val maze = MazeGame.createMaze(BombedMazeFactory())
        assertTrue(maze.getRoom(1) != null)
        assertTrue(maze.getRoom(1) is RoomWithABomb)
        assertTrue(maze.getRoom(1)?.getSide(Side.NORTH) is BombedWall)
    }
}