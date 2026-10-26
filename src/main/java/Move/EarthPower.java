package Move;
import ru.ifmo.se.pokemon.*;

public final class EarthPower extends SpecialMove {
    public EarthPower() { super(Type.GROUND, 90, 1.0, 0, 1); }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }

    @Override public String describe() { return "использует Earth Power!"; }
}
