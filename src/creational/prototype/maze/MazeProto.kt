package creational.prototype.maze

class MazeProto {
    private val roomList = kotlin.collections.ArrayList<RoomProto>()
    fun addRoom(room: RoomProto) { roomList.add(room) }
    fun getRoom(roomNumber: Int) = roomList.find { room -> room.number == roomNumber }
}
