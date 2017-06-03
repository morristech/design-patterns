package builder

import base.maze.Maze

interface MazeBuilder {
    fun buildMaze()
    fun buildRoom(roomNumber: Int)
    fun buildDoor(roomFrom: Int, roomTo: Int)
    fun getMaze(): Maze
}