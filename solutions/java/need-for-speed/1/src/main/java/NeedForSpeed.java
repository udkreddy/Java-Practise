class NeedForSpeed {
    private int maxSpeed;
    private int batteryPerc = 100;
    private int driven = 0;
    private int drain;
    private int nitro;
    NeedForSpeed(int speed, int batteryDrain) {
        maxSpeed = speed;
        drain = batteryDrain;
    }

    public boolean batteryDrained() {
        if(driven * drain  + drain > 100) return true;
        return driven*drain == 100;
    }

    public int distanceDriven() {
        return driven * maxSpeed;
    }

    public void drive() {
        if(driven * drain < 100)
            driven++;
            // batteryPerc-=drain;
    }

    public int distanceLeft() {
        return (100/drain - driven)* maxSpeed ;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    private int trackDistance;
    RaceTrack(int distance) {
        trackDistance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int distanceLeft = car.distanceLeft();
        return (distanceLeft >= trackDistance);
    }
}
