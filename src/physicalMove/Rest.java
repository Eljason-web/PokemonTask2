package physicalMove;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Rest extends PhysicalMove {
    public Rest () {
        super(Type.PSYCHIC, 0,0);
    }

    @Override
    public String describe() {
        return ("The user sleeps for two turns to fully restore HP and heal any status problem!");
    }
}
