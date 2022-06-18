import Interfaces.Participants;


public class Human implements Participants {
    private String name;
    private boolean check = true;
    public Human(String name) {
        this.name = name;
    }

    @Override
    public void finish() {
        if (check)   System.out.println("Человек " + this.name + " прошел все испытания!");
    }

    @Override
    public void jump(int height) {
        if (height <= 30 && check) {
            System.out.print("Человек " + this.name + " ");
            Participants.checkJump(check);
            System.out.println(height + " метров.");
        } else if (check) {
            check = false;
            System.out.println("Человек " + this.name + " выбыл из соревнования");
        }
    }

    @Override
    public void run(int distance) {
        if (distance <= 50 && check) {
            System.out.print("Человек " + this.name + " ");
            Participants.checkRun(check);
            System.out.println(distance + " метров.");
        } else if (check) {
            check = false;
            System.out.println("Человек " + this.name + " выбыл из соревнования");
        }
    }
}