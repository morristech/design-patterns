package creational.builder

import base.maze.Maze

/**
 * Have different ways of building a maze by implementing this builder methods.
 *
 * The final result is delivered with the getMaze method.
 *
 * The complex logic is implemented in the Builder concrete class.
 *
 * Pass an instance of a MazeBuilder to the MazeGame.createMaze() method.
 */
interface MazeBuilder {
    fun buildMaze()
    fun buildRoom(roomNumber: Int)
    fun buildDoor(roomFrom: Int, roomTo: Int)
    fun getMaze(): Maze
}