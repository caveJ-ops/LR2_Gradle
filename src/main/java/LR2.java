import ru.ifmo.se.pokemon.*;
import Pokemon.*;

public class LR2 {
    public static void main(String[] args) {
        Battle b = new Battle();

        // Команда 1
        b.addAlly(new Corsola("Коралл", 15));
        b.addAlly(new Tirtouga("Черепашка", 15));
        b.addAlly(new Carracosta("Панцирь", 37));

        // Команда 2
        b.addFoe(new Deino("Малыш", 1));
        b.addFoe(new Zweilous("Двуглав", 50));
        b.addFoe(new Hydreigon("Трёхглав", 64));

        b.go();
    }
}
