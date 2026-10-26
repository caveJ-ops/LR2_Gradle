package Move;
import ru.ifmo.se.pokemon.*;

public final class BrutalSwing extends PhysicalMove {
    public BrutalSwing() { super(Type.DARK, 60, 1.0, 0, 1); }

    @Override public String describe() { return "яростно размахивается (Brutal Swing)!"; }
}
