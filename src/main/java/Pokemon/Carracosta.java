package Pokemon;
import ru.ifmo.se.pokemon.*;
import Move.*;

public final class Carracosta extends Tirtouga {
    public Carracosta(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.ROCK);
        setStats(74, 108, 133, 83, 65, 32);
        addMove(new FocusBlast());
    }
}
