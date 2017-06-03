package factory_method

import base.maze.*

open class MazeGame {
    private fun makeMaze() = Maze()

    /**
     * Subclasses override this factory methods to choose its components
     */
    open protected fun makeWall() = Wall()
    open protected fun makeRoom(n: Int) = Room(n)
    open protected fun makeDoor(r1: Room, r2: Room) = Door(r1, r2)

    fun createMaze(): Maze {
        val maze = makeMaze()
        val r1 = makeRoom(1)
        val r2 = makeRoom(2)
        val door = makeDoor(r1, r2)

        maze.addRoom(r1)
        maze.addRoom(r2)

        r1.setSide(Side.NORTH, makeWall())
        r1.setSide(Side.EAST, door)
        r1.setSide(Side.SOUTH, makeWall())
        r1.setSide(Side.WEST, makeWall())

        r2.setSide(Side.NORTH, makeWall())
        r2.setSide(Side.EAST, makeWall())
        r2.setSide(Side.SOUTH, makeWall())
        r2.setSide(Side.WEST, door)

        return maze
    }
}
