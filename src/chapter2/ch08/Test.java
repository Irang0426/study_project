package chapter2.ch08;

public class Test {
    public static void main(String[] args) {

        Person person = new Person();
        person.height = 180;
        person.weight = 78;
        person.gender = "남성";
        person.name = "Tomas";
        person.age = 37;

        person.showInfo();

        Order order = new Order();
        order.orderId = 202011020003L;
        order.phoneNumber = 01023450001;
        order.address = "서울시 강남구 역삼동 111-333";
        order.date = 20201102;
        order.time = 130258;
        order.price = 35000;
        order.menuNumber = 3;

        order.showOrder();

        System.out.println("----------------------- 생성자 사용 -----------------------");

        Person person2 = new Person(180, 78, "남성", "Tomas", 37);
        person2.showInfo();

        Order order2 = new Order(202011020003L, 01023450001, "서울시 강남구 역삼동 111-333", 20201102, 130258, 35000, 3);
        order2.showOrder();
    }
}
