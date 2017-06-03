package abstract_factory.base;

public class Door implements MapSite {
    private final Room r1;
    private final Room r2;

    public Door(Room r1, Room r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public void enter() {

    }
}
