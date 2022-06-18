import Interfaces.Obstacles;

public class Track implements Obstacles {
    private int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    @Override
    public int getDist() {
        return distance;
    }

    @Override
    public String getType() {
        return "Track";
    }
}
