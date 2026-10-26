package Pokemon;
import ru.ifmo.se.pokemon.*;
import Move.*;

public final class Hydreigon extends Zweilous {
    public Hydreigon(String name, int level) {
        super(name, level);
        setType(Type.DARK, Type.DRAGON);
        setStats(92, 105, 90, 125, 90, 98);
        addMove(new BrutalSwing());
    }
}
