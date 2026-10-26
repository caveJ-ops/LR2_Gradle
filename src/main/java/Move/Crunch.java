package Move;
import ru.ifmo.se.pokemon.*;

public final class Crunch extends PhysicalMove {
    public Crunch() { super(Type.DARK, 80, 1.0, 0, 1); }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.2) p.setMod(Stat.DEFENSE, -1);
    }

    @Override public String describe() { return "кусает (Crunch)!"; }
}
