package pokemon.species;

import ru.ifmo.se.pokemon.*;

import physicalMove.Confide;
import physicalMove.LeechLife;
import physicalMove.Rest;
import physicalMove.SilverWind;

public class Venomoth extends Venonat{
    public Venomoth (String name, int level){
        super(name, level);
        setType(Type.BUG,Type.POISON);
        setStats(70,65,60,90,75,90);
        setMove(new LeechLife(), new Rest(), new Confide(), new SilverWind());
    }
}
