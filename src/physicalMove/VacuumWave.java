package physicalMove;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class VacuumWave extends PhysicalMove {
    public VacuumWave() {
        super(Type.FIGHTING, 40, 100);
    }

    @Override
    public String describe() {
        return ("The user whirls its fists to send a wave of pure vacuum at the target!");
    }
}
