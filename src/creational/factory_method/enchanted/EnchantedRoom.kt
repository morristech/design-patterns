package creational.factory_method.enchanted

import base.maze.Room

class EnchantedRoom(roomNumber: Int, private val spell: Spell) : Room(roomNumber)
