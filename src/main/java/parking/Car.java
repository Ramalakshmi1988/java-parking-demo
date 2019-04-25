package parking;

public class Car {

    private boolean hasPass;
    private String licensePlate;
    private int hoursStayed;

    public Car (boolean hasPass, String licensePlate){
        this.hasPass = hasPass;
        this.licensePlate = licensePlate;
    }

    public boolean isHasPass() {
        return this.hasPass;
    }

    public void setHasPass(boolean hasPass) {
        this.hasPass = hasPass;
    }

    public int getHoursStayed(){
        return this.hoursStayed;
    }

    public void setHoursStayed(int hoursStayed){
        this.hoursStayed = hoursStayed;
    }

    public int getTotalFee(){
        int fee = this.hoursStayed * 5;
        if (fee < 30){
            return fee;
        }
        else {return 30;}
    }
}
