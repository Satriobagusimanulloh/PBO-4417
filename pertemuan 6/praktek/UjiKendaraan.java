public class UjiKendaraan {
    public static void main(String[] args) {
        KendaraanMelaju(new Vehicle());
        System.out.println();

        KendaraanMelaju(new Bicycle());
        System.out.println();

        KendaraanMelaju(new MotorVehicle());
        System.out.println();

        KendaraanMelaju(new Car());
        System.out.println();

        KendaraanMelaju(new MotorCycle());
        
    }
    public static void KendaraanMelaju(Vehicle object) {
        object.goStraight();
        object.turnLeft();
        object.turnRight();
    }
}