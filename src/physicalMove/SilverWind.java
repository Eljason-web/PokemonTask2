package physicalMove;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class SilverWind extends PhysicalMove {
    public SilverWind () {
        super(Type.BUG, 60, 100);
    }

    @Override
    public String describe() {
        return ("The target is attacked with powdery scales blown by wind!");
    }
}
