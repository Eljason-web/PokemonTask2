package pokemon.species;

import ru.ifmo.se.pokemon.*;

import physicalMove.Confide;
import physicalMove.LeechLife;
import physicalMove.Rest;

public class Venonat extends Pokemon {
    public Venonat (String name, int level) {
        super(name, level);
        setType(Type.BUG,Type.POISON);
        setStats(60,55,50,40,55,45);
        setMove(new LeechLife(), new Rest(), new Confide());
    }
}
