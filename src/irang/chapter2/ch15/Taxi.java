package irang.chapter2.ch15;

public class Taxi {
    String name;
    int money;

    public Taxi(String name) {
        this.name = name;
    }

    public void take(int money) {
        this.money += money;
    }

    public void showTaxiInfo() {
        System.out.println(name + " 수입은 " + money + "원 입니다.");
    }

}
