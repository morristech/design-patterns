package abstract_factory_kotlin.bombed

import abstract_factory_kotlin.base.MazeFactory
import abstract_factory_kotlin.base.Room
import abstract_factory_kotlin.base.Wall

class BombedMazeFactory : MazeFactory() {
    override fun makeWall() = BombedWall()
    override fun makeRoom(n: Int) = RoomWithABomb(n)
}
