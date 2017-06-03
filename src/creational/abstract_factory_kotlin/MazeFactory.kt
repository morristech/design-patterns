package creational.abstract_factory_kotlin

import base.maze.Door
import base.maze.Maze
import base.maze.Room
import base.maze.Wall

/**
 * Different implementations will extend this MazeFactory class.
 *
 * By overriding the "make" methods and using its own custom Walls, Rooms and Doors.
 *
 * Pass each MazeFactory instance to the MazeGame.createMaze() method.
 */
open class MazeFactory {
    fun makeMaze() = Maze()
    open fun makeWall() = Wall()
    open fun makeRoom(n: Int) = Room(n)
    open fun makeDoor(r1: Room, r2: Room) = Door(r1, r2)
}
