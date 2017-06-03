package base.maze

open class Door(val r1: Room, val r2: Room) : MapSite {
    override fun enter() { }
}
