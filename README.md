Based on the base class Pokemon, write your own classes for the given Pokémon species. Each Pokémon species should have one or two types and standard basic stats:

health points (HP)
attack
defense
special attack
special defense
speed
Pokémon classes must be inherited according to the Pokémon evolution chain. Based on base classes PhysicalMove, SpecialMoveimplement StatusMoveyour own classes for the given attack types. All designed classes that don't have descendants must be implemented in such a way that they cannot be inherited.

The attack must have the standard type, power, and accuracy. Standard attack effects must be implemented. Assign each Pokémon type the appropriate attacks. The Pokémon level is chosen to be the minimum required for all implemented attacks.

Using the Battle Simulation class Battle, create 2 teams of Pokemon (each Pokemon must have a name) and start the battle.

The base classes and battle simulator are located in a jar archive  (updated October 9, 2018, to fix a bug with adding attacks and encoding). Javadoc documentation is available here .

Information about Pokemon, evolution chains and attacks can be found on the websites http://poke-universe.ru , http://pokemondb.net , http://veekun.com/dex/pokemon

Comments
The purpose of this work is to understand the basic concepts of OOP using a simple example and learn how to use them in programs.

What needs to be done (brief description)

Review the documentation , paying particular attention to the classes Pokemon and Move. As you continue to complete the lab, read the documentation several more times.
Download the Pokemon.jar file. You'll need it to compile and run the program. Don't unzip it! You'll need to learn how to include external jar files in your program.
Write a minimal working program and see how it works.
Battle b = new Battle();
Pokemon p1 = new Pokemon("Alien", 1);
Pokemon p2 = new Pokemon("Predator", 1);
b.addAlly(p1);
b.addFoe(p2);
b.go();
Create one of the Pokémon classes for your variant. The class must inherit from the base class Pokemon. In the constructor, you'll need to specify the Pokémon's types and basic stats. After that, try adding the Pokémon to battle.
Create one of the attack classes for your variant (it's best to start with a physical or special attack). The class must inherit from the PhysicalMove or class SpecialMove. In the constructor, you'll need to specify the attack type, its power, and accuracy. Then, add the attack to the Pokémon and test its effect in battle. Don't forget to override the method describeto display the desired message.
If an attack's effect differs from the standard one, for example, if the Pokémon doesn't miss, or if the attacking Pokémon also takes damage, then the attack class must additionally override the corresponding methods (see the documentation). When implementing attacks that change the Pokémon's status (successors StatusMove), you will likely need to consider the class Effect. It allows you to change the Pokémon's state or its basic stat modifier for one or more turns.
Complete all necessary attacks and all Pokémon, distribute Pokémon among teams, and start the battle.
Enter the option: 
7
Your Pokemon:
Guzzlord

Attacks:
 Razor Leaf
 X-Scissor
 Air Slash
 Vacuum Wave
 
Venonat

Attacks:
 Leech Life
 Rest
 Confide
 
Venomoth

Attacks:
 Leech Life
 Rest
 Confide
 Silver Wind
 
Litwick

Attacks:
 Confide
 Shadow Ball
 
Lampent

Attacks:
 Confide
 Shadow Ball
 Astonish
 
Chandelier

Attacks:
 Confide
 Shadow Ball
 Astonish
 Energy Ball
