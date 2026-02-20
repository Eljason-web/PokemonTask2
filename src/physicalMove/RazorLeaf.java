package physicalMove;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class RazorLeaf extends PhysicalMove {
    public RazorLeaf () {
        super(Type.GRASS, 55,95);
    }

    @Override
    public String describe() {
        return ("Sharp-edged leaves are launched to slash at the opposing Pokémon!");
    }
}
