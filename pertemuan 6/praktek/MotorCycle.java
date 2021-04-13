public class MotorCycle extends MotorVehicle {
    private int numGear = 0;

    public MotorCycle() {

    }
    public void setGearFoot(int numGear) {
        this.numGear = numGear;
    }
    public int getGearFoot() {
        return this.numGear;
    }
    public void goStraight() {
        System.out.println("Motorcycle Maju....");
    }
    public void turnLeft() {
        System.out.println("Motorcycle Belok Kiri");
    }
    public void turnRight() {
        System.out.println("Motorcycle Belok Kanan");
    }
}