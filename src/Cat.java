import Interfaces.Participants;


public class Cat implements Participants {
    private String name;
    private boolean check = true;

    @Override
    public void finish() {
        if (check)   System.out.println("Кот " + this.name + " прошел все испытания!");
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void jump(int height) {
        if (height <= 5 && check) {
            System.out.print("Кот " + this.name + " ");
            Participants.checkJump(check);
            System.out.println(height + " метров.");
        } else if (check) {
            check = false;
            System.out.println("Кот " + this.name + " выбыл из соревнования");
        }
    }

    @Override
    public void run(int distance) {
        if (distance <= 20 && check) {
            System.out.print("Кот " + this.name + " ");
            Participants.checkRun(check);
            System.out.println(distance + " метров.");
        } else if (check) {
            check = false;
            System.out.println("Кот " + this.name + " выбыл из соревнования");
        }
    }
}
