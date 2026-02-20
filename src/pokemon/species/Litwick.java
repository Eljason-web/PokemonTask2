package pokemon.species;

import ru.ifmo.se.pokemon.*;

import physicalMove.Confide;
import physicalMove.ShadowBall;

public class Litwick extends Pokemon {
    public Litwick (String name, int level){
        super(name, level);
        setType(Type.GHOST,Type.FIRE);
        setStats(70,65,60,90,75,90);
        setMove(new Confide(), new ShadowBall());
    }
}
