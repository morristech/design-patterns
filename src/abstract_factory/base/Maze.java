package abstract_factory.base;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    private List<Room> roomList = new ArrayList<>();

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public Room getRoom(int roomNumber) {
        return roomList.stream().filter(room -> room.getNumber() == roomNumber).findFirst().get();
    }
}
