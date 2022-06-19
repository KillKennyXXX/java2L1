import Interfaces.Obstacles;
import Interfaces.Participants;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Participants[] p = new Participants[3];
        Obstacles[] t = new Obstacles[7];
        t[0] = new Track((int) (Math.random() * 10 + 1));
        t[1] = new Track((int) (Math.random() * 20 + 1));
        t[2] = new Wall((int) (Math.random() * 30 + 1));
        t[3] = new Track((int) (Math.random() * 40 + 1));
        t[4] = new Wall((int) (Math.random() * 20 + 1));
        t[5] = new Track((int) (Math.random() * 50 + 1));
        t[6] = new Track((int) (Math.random() * 40 + 1));

        p[0] = new Cat("Борис");
        p[1] = new Human("Олег");
        p[2] = new Robot("Федор");

        for (Participants i : p) {
            for (Obstacles j : t) {
                j.getDist(i);
            }
           i.finish();
        }

    }
}
