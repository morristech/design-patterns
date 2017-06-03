package builder

import base.maze.*

class StandardMazeBuilder : MazeBuilder {

    var currentMaze: Maze = Maze()

    override fun buildMaze() {
        currentMaze = Maze()
    }

    override fun buildRoom(roomNumber: Int) {
        currentMaze.apply {
            if (getRoom(roomNumber) == null) {
                val room = Room(roomNumber)
                addRoom(room)
                room.setSide(Side.NORTH, Wall())
                room.setSide(Side.EAST, Wall())
                room.setSide(Side.SOUTH, Wall())
                room.setSide(Side.WEST, Wall())
            }
        }
    }

    override fun buildDoor(roomFrom: Int, roomTo: Int) {
        val room1 = currentMaze.getRoom(roomFrom)
        val room2 = currentMaze.getRoom(roomTo)
        if (room1 != null && room2 != null) {
            val door = Door(room1, room2)
            room1.setSide(CommonWall(room1, room2), door)
            room2.setSide(CommonWall(room2, room1), door)
        }

    }

    private fun  CommonWall(roomA: Room, roomB: Room): Side {
        return Side.EAST // for simplicity
    }

    override fun getMaze(): Maze {
        return currentMaze
    }
}