package creational.abstract_factory_kotlin.enchanted

import creational.abstract_factory_kotlin.MazeFactory
import base.maze.Room

class EnchantedMazeFactory : MazeFactory() {
    override fun makeRoom(n: Int) = EnchantedRoom(n, castSpell())
    override fun makeDoor(r1: Room, r2: Room) = DoorNeedingSpell(r1, r2)
    private fun castSpell() = Spell()
}
