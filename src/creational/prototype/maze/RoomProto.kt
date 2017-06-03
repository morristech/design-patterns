package creational.prototype.maze

import base.maze.MapSite
import base.maze.Room
import base.maze.Side

open class RoomProto : MapSite {

    var number: Int? = null

    private val sideMap = HashMap<Side, MapSite>()

    fun setSide(side: Side, mapSite: MapSite) {
        sideMap.put(side, mapSite)
    }

    fun getSide(side: Side) = sideMap[side]

    override fun enter() {

    }

    open fun clone() = RoomProto()
}
