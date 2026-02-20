package physicalMove;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class X_Scissor extends PhysicalMove {
    public X_Scissor() {
    super(Type.BUG, 80, 100);
}

    @Override
    public String describe() {
        return ("The user cuts the target with scissor-shaped claws!");
    }
}
