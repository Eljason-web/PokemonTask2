package pokemon.species;

import ru.ifmo.se.pokemon.*;

import physicalMove.Astonish;
import physicalMove.Confide;
import physicalMove.ShadowBall;

public class Lampent extends Litwick{
    public Lampent(String name, int level){
        super(name, level);
        setType(Type.GHOST,Type.FIRE);
        setStats(60,40,60,95,60,55);
        setMove(new Confide(), new ShadowBall(), new Astonish());
    }
}
