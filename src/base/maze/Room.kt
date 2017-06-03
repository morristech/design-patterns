package base.maze

open class Room(val number: Int) : MapSite {
    private val sideMap = HashMap<Side, MapSite>()

    fun setSide(side: Side, mapSite: MapSite) {
        sideMap.put(side, mapSite)
    }

    fun getSide(side: Side) = sideMap[side]

    override fun enter() {

    }
}
