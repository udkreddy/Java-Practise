public class JedliksToyCar {
    private int distanceDriven;
    private int batteryPercent = 100;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        return "Battery " + ((batteryPercent>0) ? ("at " + batteryPercent+"%"): "empty");        
    }

    public void drive() {
        if(batteryPercent>0) {
            distanceDriven+=20;
            batteryPercent--;
        }
    }
}
