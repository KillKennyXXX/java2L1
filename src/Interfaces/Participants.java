package Interfaces;

public interface Participants {

    void jump(int height);

    void run(int distance);

   void finish();

    public static void checkRun(boolean i) {
        if (i) {
            System.out.print("пробежал ");
        } else {
            System.out.print("не пробежал ");
        }
    }

    public static void checkJump(boolean i) {
        if (i) {
            System.out.print("перепрыгнул ");
        } else {
            System.out.print("не перепрыгнул " );
        }
    }


}