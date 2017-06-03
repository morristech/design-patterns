package abstract_factory.enchanted;

import abstract_factory.base.Door;
import abstract_factory.base.Room;

public class DoorNeedingSpell extends Door {
    public DoorNeedingSpell(Room r1, Room r2) {
        super(r1, r2);
    }
}
