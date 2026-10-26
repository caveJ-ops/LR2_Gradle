package Pokemon;
import ru.ifmo.se.pokemon.*;
import Move.*;

public class Zweilous extends Deino {
    public Zweilous(String name, int level) {
        super(name, level);
        setType(Type.DARK, Type.DRAGON);
        setStats(72, 85, 70, 65, 70, 58);
        addMove(new DoubleHit());
    }
}
