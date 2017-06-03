package abstract_factory.base;

import java.util.HashMap;
import java.util.Map;

public class Room implements MapSite {
    private final int roomNumber;
    private final Map<Side, MapSite> sideMap = new HashMap<>();

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setSide(Side side, MapSite mapSite) {
        sideMap.put(side, mapSite);
    }

    public MapSite getSide(Side side) {
        return sideMap.get(side);
    }

    @Override
    public void enter() {

    }

    public int getNumber() {
        return roomNumber;
    }
}
