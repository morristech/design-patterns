package abstract_factory.enchanted;

import abstract_factory.base.Room;

public class EnchantedRoom extends Room {
    private final Spell spell;

    public EnchantedRoom(int roomNumber, Spell spell) {
        super(roomNumber);
        this.spell = spell;
    }
}
