import ru.ifmo.se.pokemon.*;

import pokemon.species.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Guzzlord("Glutton", 50));
        b.addAlly(new Venonat("Mantra",50));
        b.addAlly(new Venomoth("Venom", 50));

        b.addFoe(new Chandelure("Spike", 50));
        b.addFoe(new Litwick("Wick",50));
        b.addFoe(new Lampent("Lamps",50));

        b.go();

    }
}