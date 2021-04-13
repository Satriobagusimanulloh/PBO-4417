public class Car extends MotorVehicle {
    private Boolean seatbelt = false;

    public Car() {

    }
    public void setSeatBelt(Boolean seatbelt) {
        this.seatbelt = seatbelt;
    }
    public Boolean getSeatBelt() {
        return this.seatbelt;
    }
    public void goStraight() {
        System.out.println("Car Maju....");
    }
    public void turnLeft() {
        System.out.println("Car Belok Kiri");
    }
    public void turnRight() {
        System.out.println("Car Belok Kanan");
    }
}