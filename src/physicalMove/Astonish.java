package physicalMove;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Astonish extends PhysicalMove {
    public Astonish() {
        super(Type.GHOST, 30, 100);
    }

    @Override
    public String describe() {
        return ("The user attacks the target while shouting in a startling fashion");
    }
}
