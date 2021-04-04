public class UjiKendaraan {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        System.out.println(kendaraan.speed);
        System.out.println(kendaraan.color);

        Bicycle sepeda = new Bicycle();
        System.out.println(sepeda.speed);
		System.out.println(sepeda.color);
        sepeda.ringBell();
		sepeda.turnRight();

        MotorVehicle motor = new MotorVehicle(2, "G 1 B");
        System.out.println(motor.getSizeofEngine());
        System.out.println(motor.getLicencePlate());
        motor.goStraight();
    }
}