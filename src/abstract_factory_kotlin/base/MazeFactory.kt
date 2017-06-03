package abstract_factory_kotlin.base

open class MazeFactory {
    fun makeMaze() = Maze()
    open fun makeWall() = Wall()
    open fun makeRoom(n: Int) = Room(n)
    open fun makeDoor(r1: Room, r2: Room) = Door(r1, r2)
}
