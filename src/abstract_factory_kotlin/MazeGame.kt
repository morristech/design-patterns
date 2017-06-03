package abstract_factory_kotlin

import abstract_factory_kotlin.base.Maze
import abstract_factory_kotlin.base.MazeFactory
import abstract_factory_kotlin.base.Side.*

object MazeGame {
    fun createMaze(factory: MazeFactory): Maze {
        val maze = factory.makeMaze()
        val r1 = factory.makeRoom(1)
        val r2 = factory.makeRoom(2)
        val door = factory.makeDoor(r1, r2)

        maze.addRoom(r1)
        maze.addRoom(r2)

        r1.setSide(NORTH, factory.makeWall())
        r1.setSide(EAST, door)
        r1.setSide(SOUTH, factory.makeWall())
        r1.setSide(WEST, factory.makeWall())

        r2.setSide(NORTH, factory.makeWall())
        r2.setSide(EAST, factory.makeWall())
        r2.setSide(SOUTH, factory.makeWall())
        r2.setSide(WEST, door)

        return maze
    }
}
