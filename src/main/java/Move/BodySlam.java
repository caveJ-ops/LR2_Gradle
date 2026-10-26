package Move;
import ru.ifmo.se.pokemon.*;

public final class BodySlam extends PhysicalMove {
    public BodySlam() { super(Type.NORMAL, 85, 1.0, 0, 1); }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.3) p.setCondition(new Effect().condition(Status.PARALYZE));
    }

    @Override public String describe() { return "обрушивается всем телом (Body Slam)!"; }
}
