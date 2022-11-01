package irang.chapter2.ch15;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Edward", 20000);
        Taxi taxi = new Taxi("잘 간다 운수택시");

        person.takeTaxi(taxi, 10000);

        person.showPersonInfo();
        taxi.showTaxiInfo();
    }
}
