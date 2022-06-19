import Interfaces.Participants;


public class Robot implements Participants {
    private String name;
    private boolean check = true;
    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void finish() {
        if (check)   System.out.println("Робот " + this.name + " прошел все испытания!");
    }

    @Override
    public void jump(int height) {
        if (height <= 40 && check) {
            System.out.print("Робот " + this.name + " ");
        } else if (check) {
            check = false;
            System.out.println("Робот " + this.name + " выбыл из соревнования");
        }
    }

    @Override
    public void run(int distance) {
        if (distance <= 40 && check) {
            System.out.print("Робот " + this.name + " ");
        } else if (check) {
            check = false;
            System.out.println("Робот " + this.name + " выбыл из соревнования");
        }
    }
    public boolean isCheck() {
        return check;
    }
}