public class MotorVehicle extends Vehicle{
    int sizeofEngine = 1;
    String licencePlate = "B 12 DS";
    
    public MotorVehicle(){
    }
    
    MotorVehicle(int sizeEng, String lcPlate){
        this.sizeofEngine = sizeEng;
        this.licencePlate = lcPlate;
    }
    
    public int getSizeofEngine(){
        return this.sizeofEngine;
    }
    
    public String getLicencePlate(){
        return this.licencePlate;
    }
}
