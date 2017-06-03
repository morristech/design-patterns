package factory_method

import base.maze.Side
import factory_method.bombed.BombedMazeGame
import factory_method.bombed.BombedWall
import factory_method.bombed.RoomWithABomb
import factory_method.enchanted.DoorNeedingSpell
import factory_method.enchanted.EnchantedMazeGame
import factory_method.enchanted.EnchantedRoom
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class MazeGameTest {
    @Test
    fun createNormalMaze() {
        val maze = MazeGame().createMaze()
        assertTrue(maze.getRoom(1) != null)
    }

    @Test
    fun createEnchantedMaze() {
        val maze = EnchantedMazeGame().createMaze()
        assertTrue(maze.getRoom(1) is EnchantedRoom)
        assertTrue(maze.getRoom(1)?.getSide(Side.EAST) is DoorNeedingSpell)
    }

    @Test
    fun createBombedMaze() {
        val maze = BombedMazeGame().createMaze()
        assertTrue(maze.getRoom(1) != null)
        assertTrue(maze.getRoom(1) is RoomWithABomb)
        assertTrue(maze.getRoom(1)?.getSide(Side.NORTH) is BombedWall)
    }
}