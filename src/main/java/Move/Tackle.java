package Move;
import ru.ifmo.se.pokemon.*;

public final class Tackle extends PhysicalMove {
    public Tackle() { super(Type.NORMAL, 40, 1.0, 0, 1); }

    @Override public String describe() { return "использует Tackle!"; }
}
