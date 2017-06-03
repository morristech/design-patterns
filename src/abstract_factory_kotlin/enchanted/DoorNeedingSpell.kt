package abstract_factory_kotlin.enchanted

import abstract_factory_kotlin.base.Door
import abstract_factory_kotlin.base.Room

class DoorNeedingSpell(r1: Room, r2: Room) : Door(r1, r2)
