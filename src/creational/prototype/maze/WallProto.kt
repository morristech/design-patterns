package creational.prototype.maze

import base.maze.MapSite

open class WallProto : MapSite {
    override fun enter() { }

    open fun clone() = WallProto()
}
