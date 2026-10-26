package Pokemon;
import ru.ifmo.se.pokemon.*;
import Move.*;

public final class Corsola extends Pokemon {
    public Corsola(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.ROCK);
        setStats(65, 55, 95, 65, 95, 35);
        addMove(new Tackle());
        addMove(new EarthPower());
        addMove(new Bulldoze());
        addMove(new Bubble());
    }
}
