package marathon;


import marathon.competitors.*;
import marathon.Obstacles.*;

public class Start {
    public static void main(String[] args) {
        competitors[] competitors = {
                new Human("SSaraKonor "),
                new Cat("Mak "),
                new Robot("T800 "),
                new Robot("Shwartz ")};

        Obstacles[] obstacles = {new RunningRoad(500), new Wall(7)};

        for (competitors c : competitors) {
            for (Obstacles o : obstacles) {
                o.goToWin(c);

                if (!c.isDistance()) {
                    break;

                }
            }

        }
        for (competitors c : competitors){
            c.info();
        }
    }
}



