package lessons.lesson10;

public class FujitsuCooler {
    private int targetTemp;
    private boolean isAcOn = false;

    public FujitsuCooler(int targetTemp) {
        this.targetTemp = targetTemp;
    }

    public void adjustTemp(int currentTemp) {
        if (currentTemp >= getTargetTemp() && !isCurrentlyCooling()) {
            System.out.println("Turning On");
            turnAcOn();
        } else if (currentTemp < getTargetTemp() && isCurrentlyCooling()) {
            System.out.println("Turning Off");
            turnAcOff();
        } else {
            System.out.println("Nothing to do");
        }
    }

    private boolean isCurrentlyCooling() {
        return isAcOn;
    }

    private void turnAcOn() {
        this.isAcOn = true;
    }

    private void turnAcOff() {
        this.isAcOn = false;
    }

    protected int getTargetTemp() {
        return targetTemp;
    }
}
