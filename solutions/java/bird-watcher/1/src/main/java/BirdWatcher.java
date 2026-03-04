
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeekCount = {0, 2, 5, 3, 7, 8, 4};
        return lastWeekCount;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean check = false;
        for (int i=0; i<birdsPerDay.length; i++){
            if (birdsPerDay[i] == 0){
                check = true;
            }
        }
        return check;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birdCount = 0;
        if(numberOfDays > birdsPerDay.length){
            for(int i=0; i<birdsPerDay.length; i++){
                birdCount = birdCount + birdsPerDay[i];
            } 
        }else{
            for(int i=0; i<numberOfDays; i++){
                birdCount = birdCount + birdsPerDay[i];
        }
    }
        return birdCount;
}
    public int getBusyDays() {
        int busyDay = 0;
        for (int i=0; i<birdsPerDay.length; i++){
            if(birdsPerDay[i] >= 5){
                busyDay++;
            }
        }
        return busyDay;
    }
}
