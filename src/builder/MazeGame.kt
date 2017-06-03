package builder

import base.maze.Maze

object MazeGame {
    fun createMaze(builder: MazeBuilder): Maze {
        builder.buildMaze()
        builder.buildRoom(1)
        builder.buildRoom(2)
        builder.buildDoor(1, 2)
        return builder.getMaze()
    }
}

