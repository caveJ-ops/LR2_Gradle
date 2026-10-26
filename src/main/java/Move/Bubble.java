package Move;
import ru.ifmo.se.pokemon.*;

public final class Bubble extends SpecialMove {
    public Bubble() { super(Type.WATER, 40, 1.0, 0, 1); }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) p.setMod(Stat.SPEED, -1);
    }

    @Override public String describe() { return "пускает пузыри (Bubble)!"; }
}
