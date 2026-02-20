package pokemon.species;

import ru.ifmo.se.pokemon.*;

import physicalMove.AirSlash;
import physicalMove.RazorLeaf;
import physicalMove.VacuumWave;
import physicalMove.X_Scissor;

public class Guzzlord extends Pokemon {
    public Guzzlord(String name, int level){
        super(name, level);
         setType(Type.DARK, Type.DRAGON);
         setStats(223, 101, 53, 97, 53, 43);
        setMove(new RazorLeaf(), new X_Scissor(), new AirSlash(), new VacuumWave());
    }
}



