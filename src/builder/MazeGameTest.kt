package builder

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class MazeGameTest {
    @Test
    fun createStandardMaze() {
        val maze = MazeGame.createMaze(StandardMazeBuilder())
        assertTrue(maze.getRoom(1) != null)
    }

    @Test
    fun createCountingMaze() {
        val countingMazeBuilder = CountingMazeBuilder()
        MazeGame.createMaze(countingMazeBuilder)
        assertEquals(2, countingMazeBuilder.getCountRooms())
        assertEquals(1, countingMazeBuilder.getCountDoors())
    }
}

