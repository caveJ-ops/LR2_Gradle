package Move;
import ru.ifmo.se.pokemon.*;

public final class Confide extends StatusMove {
    public Confide() { super(Type.NORMAL, 0, 1.0, 0, 1); }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }

    @Override public String describe() { return "рассказывает секрет (Confide), снижая спецатаку врага."; }
}
