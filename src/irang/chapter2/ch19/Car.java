package irang.chapter2.ch19;

public class Car {
    private static int serialCarNum = 10000;
    private int carNum;

    public Car() {
        serialCarNum++;
        carNum = serialCarNum;
    }

    public int getCarNum() {
        return carNum;
    }
}
