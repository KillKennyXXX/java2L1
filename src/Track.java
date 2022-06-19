import Interfaces.Obstacles;
import Interfaces.Participants;

public class Track implements Obstacles {
    private int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    @Override
    public void getDist(Participants p) {
        p.run(distance);
        if(p.isCheck()) {
            System.out.println(" пробежал " + distance + " метров");
        }

    }

}
