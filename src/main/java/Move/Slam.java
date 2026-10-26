package Move;
import ru.ifmo.se.pokemon.*;

public final class Slam extends PhysicalMove {
    public Slam() { super(Type.NORMAL, 80, 0.75, 0, 1); }

    @Override public String describe() { return "бьёт хвостом (Slam)!"; }
}
