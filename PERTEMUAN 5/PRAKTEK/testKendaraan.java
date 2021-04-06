public class testKendaraan {
    public static void main(String[] args) {
        Bicycle sepeda = new Bicycle();
        MotorVehicle motor = new MotorVehicle(2, "B 1553 JP");
        
        sepeda.ringBell();
        
        System.out.println("Plat Sepeda Motor : "+motor.getLicencePlate());
        System.out.println("Mesin : "+motor.getSizeofEngine());
    }
}
