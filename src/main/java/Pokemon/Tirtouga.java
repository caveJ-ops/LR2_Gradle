package Pokemon;
import ru.ifmo.se.pokemon.*;
import Move.*;

public class Tirtouga extends Pokemon {
    public Tirtouga(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.ROCK);
        setStats(54, 78, 103, 53, 45, 22);
        addMove(new Withdraw());
        addMove(new Confide());
        addMove(new Crunch());
    }
}
