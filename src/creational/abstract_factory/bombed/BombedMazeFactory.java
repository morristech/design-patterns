package creational.abstract_factory.bombed;

import creational.abstract_factory.base.MazeFactory;
import creational.abstract_factory.base.Room;
import creational.abstract_factory.base.Wall;

public class BombedMazeFactory extends MazeFactory {
    @Override
    public Wall makeWall() {
        return new BombedWall();
    }

    @Override
    public Room makeRoom(int n) {
        return new RoomWithABomb(n);
    }

}
