package pokemon.species;

import ru.ifmo.se.pokemon.*;

import physicalMove.Astonish;
import physicalMove.Confide;
import physicalMove.EnergyBall;
import physicalMove.ShadowBall;

public class Chandelure extends Litwick{
    public Chandelure (String name, int level){
        super(name, level);
        setType(Type.GHOST,Type.FIRE);
        setStats(60,55,90,145,90,80);
        setMove(new Confide(),new ShadowBall(),new Astonish(),new EnergyBall());
    }
}
