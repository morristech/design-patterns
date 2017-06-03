package builder

import base.maze.Maze

class CountingMazeBuilder : MazeBuilder {
    private var countRooms = 0
    private var countDoors = 0

    override fun buildMaze() {
        countRooms = 0
        countDoors = 0
    }

    override fun buildRoom(roomNumber: Int) {
        countRooms++
    }

    override fun buildDoor(roomFrom: Int, roomTo: Int) {
        countDoors++
    }

    override fun getMaze(): Maze {
        return Maze()
    }

    fun  getCountRooms() = countRooms
    fun  getCountDoors() = countDoors
}