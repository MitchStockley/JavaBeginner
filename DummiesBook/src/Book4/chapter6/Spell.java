package Book4.chapter6;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class Spell {

    public String name;
    public SpellType type;

    public String description;
    public int price;

    public enum SpellType {SPELL, CHARM, CURSE}

    public Spell(String name, SpellType type, String description, int price) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Spell{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Spell> spells = new ArrayList<>();
        spells.add(new Spell("Aparecium", SpellType.SPELL, "Makes invisible ink appear", 10));
        spells.add(new Spell("Avis", Spell.SpellType.SPELL,
                "Launches birds from your wand.", 5));
        spells.add(new Spell("Engorgio", Spell.SpellType.CHARM,
                "Enlarges something.", 20));
        spells.add(new Spell("Fidelius", Spell.SpellType.CHARM,
                "Hides a secret within someone.", 23));
        spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL,
                "Stops all current spells.", 30));
        spells.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE,
                "Locks an opponent's legs.", 35));

        double sumSpells = spells.stream()
                .mapToDouble(s -> s.price)
                .sum();

        int count = (int) spells.stream().count();

        OptionalDouble avg = spells.stream()
                .mapToDouble(s -> s.price)
                .average();

        if(avg.isPresent()){
            System.out.println("Average =: " + avg.getAsDouble());
        }

        System.out.println("Sum of spells are: " + sumSpells);
        System.out.println("Number of spells:" + count);

        System.out.println("\n Start of parallel streams");

        spells.parallelStream()
                .forEach(s -> System.out.println(s.toString()));



    }
}
