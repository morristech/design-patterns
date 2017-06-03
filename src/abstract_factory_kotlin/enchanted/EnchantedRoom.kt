package abstract_factory_kotlin.enchanted

import abstract_factory_kotlin.base.Room

class EnchantedRoom(roomNumber: Int, private val spell: Spell) : Room(roomNumber)
