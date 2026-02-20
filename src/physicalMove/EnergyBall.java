package physicalMove;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class EnergyBall extends PhysicalMove {
    public EnergyBall() {
        super(Type.GRASS, 90, 100);
    }

    @Override
    public String describe() {
        return ("The user draws power from nature and fires it at the target!");
    }
}
