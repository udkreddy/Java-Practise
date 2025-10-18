class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    int driveUnits;
    int driven = 0;
    int victoryCount;
    public ProductionRemoteControlCar() {
        driveUnits = 10;
    }
    public void drive() {
        driven++;
    }

    public int getDistanceTravelled() {
        return driven*driveUnits;
    }

    public int getNumberOfVictories() {
        return victoryCount;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        victoryCount = numberOfVictories;
    }
    
    @Override
    public int compareTo(ProductionRemoteControlCar otherCar) {
        return otherCar.getNumberOfVictories() - victoryCount;
    }
}
