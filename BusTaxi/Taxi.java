class Taxi {
    String number;
    String drive;
    String goal;
    int goaldrive;
    String price;
    String driveprice;

}

class taxidrive {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        taxi.number= "1996번";
        taxi.drive = "2km";
        taxi.goal = "동대구역";
        taxi.goaldrive = 5;
        taxi.price = "3300원";
        taxi.driveprice = "100원";

        System.out.println(taxi.number + " 택시가 운행을 시작 합니다. 기본거리는 " + taxi.drive + "이며, 목적지 " + taxi.goal + "까지의 거리는 " + taxi.goaldrive + "km 입니다. 기본요금은 " + taxi.price + " 이며, 거리당 " + taxi.driveprice + "씩 늘어납니다.");
    }
}
