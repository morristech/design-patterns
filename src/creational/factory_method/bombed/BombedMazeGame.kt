package creational.factory_method.bombed

import creational.factory_method.MazeGame

class BombedMazeGame : MazeGame() {
    override fun makeWall() = BombedWall()
    override fun makeRoom(n: Int) = RoomWithABomb(n)
}
