package irang.chapter3.ch16;

public class BeginnerLevel extends PlayerLevel{
    int level = 1;

    @Override
    void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("jump 못하지롱");
    }

    @Override
    void turn() {
        System.out.println("turn 못하지롱");
    }

    @Override
    void showLevelMessage() {
        System.out.println("****** 초급자 레벨입니다. ******");
    }
}
