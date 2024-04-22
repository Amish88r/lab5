import comands.Color;
import dragon.Coordinates;
import dragon.Dragon;
import dragon.DragonType;
import dragon.Person;

import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon(
                1L,
                "Amir",
                new Coordinates(),
                ZonedDateTime.now(),
                20,
                100,
                Color.RED,
                DragonType.WATER,
                new Person()
        );
        System.out.println(dragon);
    }
}
