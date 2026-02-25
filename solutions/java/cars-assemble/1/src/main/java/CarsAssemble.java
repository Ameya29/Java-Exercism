public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if(speed <= 4){
            return (double)speed * 221 * 1; 
        }
        else if(speed > 4 && speed <= 8){
            return (double)speed * 221 * 0.9;
        }
        else if(speed == 9){
            return (double)speed * 221 * 0.8; 
        }
        else{
            return (double)speed * 221 * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        if(speed <= 4){
            return (int)(speed * 221 * 1 / 60); 
        }
        else if(speed > 4 && speed <= 8){
            return (int)(speed * 221 * 0.9 / 60);
        }
        else if(speed == 9){
            return (int)(speed * 221 * 0.8 / 60); 
        }
        else{
            return (int)(speed * 221 * 0.77 / 60);
        }
    }
}
