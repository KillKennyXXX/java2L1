import Interfaces.Obstacles;
import Interfaces.Participants;

public class Wall implements Obstacles {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void getDist(Participants p) {
       p.jump(height);
       if(p.isCheck()) {
           System.out.println(" перепрыгнул " + height + " метров");
       }

    }
}
