package abstract_factory_kotlin.base

import kotlin.collections.ArrayList

class Maze {
    private val roomList = ArrayList<Room>()
    fun addRoom(room: Room) { roomList.add(room) }
    fun getRoom(roomNumber: Int) = roomList.find { room -> room.number == roomNumber }
}
