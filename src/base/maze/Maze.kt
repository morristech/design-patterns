package base.maze

class Maze {
    private val roomList = kotlin.collections.ArrayList<Room>()
    fun addRoom(room: Room) { roomList.add(room) }
    fun getRoom(roomNumber: Int) = roomList.find { room -> room.number == roomNumber }
}
