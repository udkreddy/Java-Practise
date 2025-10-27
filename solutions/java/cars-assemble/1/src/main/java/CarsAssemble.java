public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double successRate = 100;
        if(speed >= 5 && speed <= 8) {
            successRate = 90;
        } else if(speed == 9) {
            successRate = 80;
        } else if(speed > 9) {
            successRate = 77;
        }
        return ( speed * 221) * successRate/ 100;
    }

    public int workingItemsPerMinute(int speed) {
        double ratePerHour = productionRatePerHour(speed);
        return (int) ratePerHour/60;
    }
}
