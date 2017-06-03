package creational.prototype

import base.maze.Maze
import base.maze.Room
import creational.prototype.maze.DoorProto
import creational.prototype.maze.MazeProto
import creational.prototype.maze.RoomProto
import creational.prototype.maze.WallProto

class MazePrototypeFactory(val prototypeWall: WallProto,
                           val prototypeRoom: RoomProto,
                           val prototypeDoor: DoorProto) {

    fun makeMaze() = MazeProto()

    fun makeWall(): WallProto {
        return prototypeWall.clone()
    }

    fun makeRoom(n: Int): RoomProto {
        val room = prototypeRoom.clone()
        room.number = n
        return room
    }

    fun makeDoor(r1: RoomProto, r2: RoomProto): DoorProto {
        val door = prototypeDoor.clone()
        door.r1 = r1
        door.r2 = r2
        return door
    }
}

