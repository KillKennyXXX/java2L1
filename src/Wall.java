import Interfaces.Obstacles;
import Interfaces.Participants;

public class Wall implements Obstacles {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getDist() {

        return height;
    }

    @Override
    public String getType() {
        return "Wall";
    }
}
