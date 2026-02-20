package physicalMove;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class ShadowBall extends PhysicalMove {
    public ShadowBall(){
        super(Type.GHOST, 85,100);
    }

    @Override
    public String describe() {
        return ("The user attacks by beating the target with a bone that contains a spirit!");
    }
}
