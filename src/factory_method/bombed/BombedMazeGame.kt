package factory_method.bombed

import factory_method.MazeGame

class BombedMazeGame : MazeGame() {
    override fun makeWall() = BombedWall()
    override fun makeRoom(n: Int) = RoomWithABomb(n)
}
