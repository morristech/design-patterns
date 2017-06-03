package creational.prototype.bombed

import creational.prototype.maze.RoomProto

class RoomWithBombProto : RoomProto() {
    override fun clone() = RoomProto()
}