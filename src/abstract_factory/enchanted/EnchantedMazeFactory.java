package abstract_factory.enchanted;

import abstract_factory.base.Door;
import abstract_factory.base.MazeFactory;
import abstract_factory.base.Room;

public class EnchantedMazeFactory extends MazeFactory {

    @Override
    public Room makeRoom(int n) {
        return new EnchantedRoom(n, castSpell());
    }

    @Override
    public Door makeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }

    private Spell castSpell() {
        return new Spell();
    }

}
