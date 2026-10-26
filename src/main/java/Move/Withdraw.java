package Move;
import ru.ifmo.se.pokemon.*;

public final class Withdraw extends StatusMove {
    public Withdraw() { super(Type.WATER, 0, 1.0, 0, 1); }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, 1);
    }

    @Override public String describe() { return "прячется в панцирь (Withdraw), повышая защиту."; }
}
