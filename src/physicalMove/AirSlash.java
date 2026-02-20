package physicalMove;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class AirSlash extends PhysicalMove {
    public AirSlash() {
        super(Type.FLYING, 75, 95);
    }

    @Override
    public String describe(){
        return "The user attacks with a blade of air that slices even the sky. It may also make the target flinch.";
    }
}

