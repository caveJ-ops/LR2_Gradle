package Move;
import ru.ifmo.se.pokemon.*;

public final class DoubleHit extends PhysicalMove {
    public DoubleHit() { super(Type.NORMAL, 35, 0.9, 0, 1); }

    // Атака наносит урон два раза
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, (int) Math.round(damage));
        def.setMod(Stat.HP, (int) Math.round(damage));
    }

    @Override public String describe() { return "бьёт дважды (Double Hit)!"; }
}
