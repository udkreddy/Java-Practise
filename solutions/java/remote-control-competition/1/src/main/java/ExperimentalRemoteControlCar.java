public class ExperimentalRemoteControlCar implements RemoteControlCar {
    int driveUnits;
    int driven = 0;
    public ExperimentalRemoteControlCar() {
        driveUnits = 20;
    }
    public void drive() {
        driven++;
    }

    public int getDistanceTravelled() {
        return driven*driveUnits;
    }
}
