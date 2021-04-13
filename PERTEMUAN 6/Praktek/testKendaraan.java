public class testKendaraan {
    public static void main(String[] args) {
        Bicycle sepeda = new Bicycle();
        sepeda.speed = 1.7;
        sepeda.color = "Hitam";
        System.out.println("\n Kecepatan Sepeda: "+sepeda.speed + " km/jam, dan memiliki warna "+sepeda.color);
        System.out.println("Belnya berbunyi: ");
        sepeda.ringBell();

        MotorVehicle motor = new MotorVehicle();
        motor.speed = 60;
        motor.color = "Maroon";
        System.out.println("\n Kecepatan motor: "+motor.speed+ " km/jam, dan memiliki warna "+motor.color);
        motor.sizeofEngine = 110;
        System.out.println("Ukuran mesin: "+motor.getSizeofEngine()+ " cc");
        motor.licencePlate = "B 1553 JP";
        System.out.println("Nomor Plat Motornya: "+motor.getLicencePlate());

        Vehicle vehicle = new Vehicle();
        System.out.println("\n Kendaraan tersebut memiliki kecepatan: "+vehicle.speed + " km/jsm, dan memiliki warna "+vehicle.color);
        vehicle.goStraight();
        vehicle.turnLeft();
        vehicle.turnRight();
        
        Car mobil = new Car();
        mobil.sizeofEngine = 2500;
        System.out.println("\n Mesinnya berukuran: "+mobil.getSizeofEngine()+ " cc");
        mobil.setSeatBelt(true);
        System.out.println("Apakah anda sudah memakai seatbelt? "+mobil.getSeatBelt());

        MotorCycle motorcycle = new MotorCycle();
        motorcycle.sizeofEngine = 150;
        System.out.println("\n Mesinnya berukuran: "+motorcycle.getSizeofEngine()+ " cc");
        motorcycle.setGearFoot(2);
        System.out.println("Giginya saat ini berada di posisi "+motorcycle.getGearFoot());
        
        LajuKendaraan(vehicle);
        LajuKendaraan(new MotorCycle());
        LajuKendaraan(mobil);

    }
    public static void LajuKendaraan(Vehicle obj){
        obj.goStraight();
    }
}
