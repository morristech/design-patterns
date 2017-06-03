package creational.prototype.maze

import base.maze.MapSite

open class DoorProto : MapSite {
    var r1: RoomProto? = null
    var r2: RoomProto? = null

    override fun enter() { }

    open fun clone() = DoorProto()
}
