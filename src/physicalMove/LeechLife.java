package physicalMove;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class LeechLife extends PhysicalMove {
    public LeechLife (){
        super(Type.BUG, 80,100);
    }

    @Override
    public String describe() {
        return ("An attack that absorbs half the damage it inflicted to restore HP!");
    }
}
