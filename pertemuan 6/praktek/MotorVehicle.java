public class MotorVehicle extends Vehicle {
    public int sizeofEngine = 1;
    public String licencePlate = "H 1 IDN";

    public MotorVehicle() {

    }
    public MotorVehicle(int sizeEng, String lcPlate) {
        this.sizeofEngine = sizeEng;
        this.licencePlate =lcPlate;
    }
    public int getSizeofEngine() {
        return this.sizeofEngine;
    }
    public String getLicencePlate() {
        return this.licencePlate;
    }
    public void goStraight() {
        System.out.println("Motor Vehicle Maju....");
    }
    public void turnLeft() {
        System.out.println("Motor Vehicle Belok Kiri");
    }
    public void turnRight() {
        System.out.println("Motor Vehicle Belok Kanan");
    }
}