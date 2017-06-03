package creational.abstract_factory_kotlin.enchanted

import base.maze.Room

class EnchantedRoom(roomNumber: Int, private val spell: Spell) : Room(roomNumber)
