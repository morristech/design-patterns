package creational.prototype.bombed

import creational.prototype.maze.WallProto

class BombedWallProto: WallProto() {
    override fun clone() = WallProto()
}