package creational.abstract_factory_kotlin.bombed

import creational.abstract_factory_kotlin.MazeFactory

class BombedMazeFactory : MazeFactory() {
    override fun makeWall() = BombedWall()
    override fun makeRoom(n: Int) = RoomWithABomb(n)
}
