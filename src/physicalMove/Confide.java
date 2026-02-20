package physicalMove;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Confide extends PhysicalMove {
    public Confide (){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    public String describe() {
        return ("The user tells the target a secret, and the target loses its ability to concentrate!");
    }
}
