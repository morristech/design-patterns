package abstract_factory.bombed;

import abstract_factory.base.MazeFactory;
import abstract_factory.base.Room;
import abstract_factory.base.Wall;

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
