package creational.factory_method.enchanted


import base.maze.Room
import creational.factory_method.MazeGame

class EnchantedMazeGame : MazeGame() {
    override fun makeRoom(n: Int) = EnchantedRoom(n, castSpell())
    override fun makeDoor(r1: Room, r2: Room) = DoorNeedingSpell(r1, r2)
    private fun castSpell() = Spell()
}
