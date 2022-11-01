package irang.chapter2.ch08;

public class Order {

    public long orderId;
    public int phoneNumber;
    public String address;
    public int date;
    public int time;
    public int price;
    public int menuNumber;

    public Order() {}

    public Order(long orderId, int phoneNumber, String address, int date, int time, int price, int menuNumber) {
        this.orderId = orderId;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.date = date;
        this.time = time;
        this.price = price;
        this.menuNumber = menuNumber;
    }

    public void showOrder() {
        System.out.println("주문 접수 번호 : " + orderId);
        System.out.println("주문 핸드폰 번호 : " + phoneNumber);
        System.out.println("주문 집 주소 : " + address);
        System.out.println("주문 날짜 : " + date);
        System.out.println("주문 시간 : " + time);
        System.out.println("주문 가격 : " + price);
        System.out.printf("메뉴 번호 : %04d \n", menuNumber);
    }
}
