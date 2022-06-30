class Bus {
    int number;
    int price;
    int maxhuman;

}

class busdrive {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.number = 706;
        bus.price = 1000;
        bus.maxhuman = 30;

        System.out.println(bus.number + "번 버스가 운행을 시작 합니다. 최대 탑승인원은 " + bus.maxhuman + "명 이며, 탑승금액은 " + bus.price + "원 입니다.");
    }
}
